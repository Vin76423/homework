package by.tms.controllers;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.services.CalcService;
import by.tms.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(path = "/api")
public class ApiController {
    private UserService userService;
    private CalcService calcService;

    public ApiController(@Qualifier("userServiceImpl") UserService userService, CalcService calcService) {
        this.userService = userService;
        this.calcService = calcService;
    }

//    private final String DUPLICATE_USER = "User with such login already exist!";
    private final String NOT_USER_BY_LOGIN = "User with such login does not exist!";
    private final String NOT_USER_BY_PASSWORD = "User with such password does not exist!";



    @GetMapping
    public String getHome() {
        return "home";
    }

    @GetMapping(path = "/reg")
    public String getRegForm() {
        return "reg";
    }

    @GetMapping(path = "/auth")
    public String getAuthForm() {
        return "auth";
    }

    @GetMapping(path = "/calc")
    public String getCalcForm(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "home";
        }
        return "calc";
    }




    @PostMapping(path = "/reg")
    public ModelAndView getRegistration(ModelAndView modelAndView, User user) {
//        if (userService.userIsContainByLogin(user)) {
//            modelAndView.addObject("massage", DUPLICATE_USER);
//            modelAndView.setViewName("reg");
//            return modelAndView;
//        }else {
//            userService.setUser(user);
//            modelAndView.setViewName("home");
//            return modelAndView;
//        }
        userService.setUser(user);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @PostMapping(path = "/auth")
    public ModelAndView getAuthorisation(ModelAndView modelAndView, User user, HttpSession session) {
        User gotFromDaoUser;
        if (! userService.userIsContainByLogin(user)) {
            modelAndView.addObject("massage", NOT_USER_BY_LOGIN);
            modelAndView.setViewName("auth");
            return modelAndView;
        }
        if (! (gotFromDaoUser = userService.getUserByLogin(user)).getPassword().equals(user.getPassword())) {
            modelAndView.addObject("massage", NOT_USER_BY_PASSWORD);
            modelAndView.setViewName("auth");
            return modelAndView;
        }
        session.setAttribute("user", gotFromDaoUser);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @PostMapping(path = "/calc")
    public ModelAndView getCalcResult(ModelAndView modelAndView, double num1, double num2, String operationType) {
        double result = calcService.calc(operationType, num1, num2);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("calc");
        return modelAndView;
    }
}
