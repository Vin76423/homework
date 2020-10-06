package by.tms.controllers;


import by.tms.entity.User;
import by.tms.entity.dto.UserAuthDto;
import by.tms.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping(path = "/home")
public class UserHomeController {
    private UserService userService;

    public UserHomeController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping
    public String getHomePage() {
        return "home";
    }



    @GetMapping(path = "/reg")
    public ModelAndView getRegForm(ModelAndView modelAndView) {
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("reg");
        return modelAndView;
    }

    @PostMapping(path = "/reg")
    public ModelAndView getRegistration(@Valid @ModelAttribute(name = "user") User user, BindingResult bindingResult, ModelAndView modelAndView) {
        if (!bindingResult.hasErrors()) {
            userService.createUser(user);
            modelAndView.setViewName("redirect:/home");
        }else {
            modelAndView.setViewName("reg");
        }
        return modelAndView;
    }



    @GetMapping(path = "/auth")
    public ModelAndView getAuthForm(ModelAndView modelAndView) {
        modelAndView.addObject("userDto", new UserAuthDto());
        modelAndView.setViewName("auth");
        return modelAndView;
    }
                                    /* - Если перенести аргумент "session" с конца на позицию после "dtoUser" - работать не будет: */
    @PostMapping(path = "/auth")    /* - Если убрать "@ModelAttribute(name = "userDto")" - работать не будет: */
    public ModelAndView getAuthorisation(@Valid @ModelAttribute(name = "userDto") UserAuthDto userDto, BindingResult bindingResult, ModelAndView modelAndView, HttpSession session) {
        if(bindingResult.hasErrors()) {
            modelAndView.setViewName("auth");
            return modelAndView;
        }
        User user = userService.getUserByLogin(userDto.getLogin());
        if (user.getPassword().equals(userDto.getPassword())) {
            session.setAttribute("user", user);
            modelAndView.setViewName("redirect:/home");
        }else {
            modelAndView.addObject("massage", "User with such password does not exist!");
            modelAndView.setViewName("auth");
        }
        return modelAndView;
    }
}
