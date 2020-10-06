package by.tms.controllers;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.services.OperationService;
import by.tms.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/account")
public class UserAccountController {
    private UserService userService;
    private OperationService operationService;

    public UserAccountController(UserService userService, OperationService operationService) {
        this.userService = userService;
        this.operationService = operationService;
    }

    @GetMapping
    public String getAccountPage(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/home";
        }else {
            return "account";
        }
    }

    @GetMapping(path = "/delete")
    protected String deleteAccount(@SessionAttribute(name = "user") User user) {
        if (user != null) {
            userService.deleteUserById(user.getId());
            user = null;
        }
        return "redirect:/home";
    }

    @GetMapping(path = "/show-by-user-login")
    public ModelAndView getOperationsByUserLogin(@SessionAttribute(name = "user") User user, ModelAndView modelAndView) {
        if (user == null) {
            modelAndView.setViewName("redirect:/home");
        }else {
            List<Operation> operations = operationService.getOperationsByUserId(user.getId());
            modelAndView.addObject("operations", operations);
            modelAndView.setViewName("show");
        }
        return modelAndView;
    }

    @GetMapping(path = "/show-by-user-login-and-operation-type")
    public ModelAndView getOperationsByUserLoginAndOperationTypeForm(@SessionAttribute(name = "user") User user, ModelAndView modelAndView) {
        if (user == null) {
            modelAndView.setViewName("redirect:/home");
        }else {
            modelAndView.setViewName("showForm");
        }
        return modelAndView;
    }

    @PostMapping(path = "/show-by-user-login-and-operation-type")
    public ModelAndView getOperationsByUserLoginAndOperationType(@SessionAttribute(name = "user") User user, @RequestAttribute(name = "operation") String operation, ModelAndView modelAndView) {
        if (user == null) {
            modelAndView.setViewName("redirect:/home");
        }else {
            List<Operation> operations = operationService.getOperationsByUserId(user.getId(), operation);
            modelAndView.addObject("operations", operations);
            modelAndView.setViewName("show");
        }
        return modelAndView;
    }

    @GetMapping(path = "/update")
    public String getUpdateForm(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/home";
        }else {
            return "update";
        }
    }

    @PostMapping(path = "/update")
    public String getUpdate(@SessionAttribute(name = "user") User user, String value, String field) {
         userService.updateUserById(user, field, value);
         return "redirect:/account";
    }
}
