package by.tms.controllers;

<<<<<<< HEAD
import by.tms.entity.dto.OperationCalcDto;
import by.tms.entity.User;
import by.tms.entity.dto.UserAuthDto;
import by.tms.services.exception.*;
=======
import by.tms.services.exceptions.DuplicateUserException;
>>>>>>> origin/master
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

<<<<<<< HEAD
    @ExceptionHandler(value = DuplicateUserException.class)
    public String DuplicateUserHandler(Model model, RuntimeException e) {
        model.addAttribute("massage", e.getMessage());
        model.addAttribute("user", new User());
        return "reg";
    }

    @ExceptionHandler(value = NotFoundUserByLoginException.class)
    public String NotFoundUserByLoginHandler(Model model, RuntimeException e) {
        model.addAttribute("massage", e.getMessage());
        model.addAttribute("userDto", new UserAuthDto());
        return "auth";
    }

    @ExceptionHandler(value = NotFoundUserByIdException.class)
    public String NotFoundUserByIdHandler(Model model, RuntimeException e) {
        model.addAttribute("massage", e.getMessage());
        return "account";
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String DivisionByZeroHandler(Model model, RuntimeException e)  {
        model.addAttribute("massage", e.getMessage());
        model.addAttribute("operationDto", new OperationCalcDto());
        return "calc";
    }

    @ExceptionHandler(value = UnsupportedCalcOperationException.class)
    public String UnsupportedOperationHandler(Model model, UnsupportedOperationException e) {
        model.addAttribute("massage", e.getMessage());
        model.addAttribute("operation", new OperationCalcDto());
        return "calc";
    }

    @ExceptionHandler(value = IllegalUsersFieldException.class)
    public String IllegalUsersFieldHandler(Model model, IllegalArgumentException e) {
        model.addAttribute("massage", e.getMessage());
        return "update";
    }

    @ExceptionHandler(value = NotFoundOperationsByUserIdException.class)
    public String NotFoundOperationsByUserIdHandler(Model model, RuntimeException e) {
        model.addAttribute("massage", e.getMessage());
        return "account";
    }

    @ExceptionHandler(value = NotFoundOperationsByUserIdAndOperationTypeException.class)
    public String NotFoundOperationsByUserIdAndOperationTypeHandler(Model model, RuntimeException e) {
        model.addAttribute("massage", e.getMessage());
        return "showForm";
    }
=======
    @ExceptionHandler(value = UnsupportedOperationException.class)
    public String UnsupportedOperationHandler(UnsupportedOperationException e, Model model) {
        model.addAttribute("massage", e.getMessage());
        return "calc";
    }

    @ExceptionHandler(value = DuplicateUserException.class)
    public String DuplicateUserHandler(DuplicateUserException e, Model model) {
        model.addAttribute("massage", e.getMessage());
        return "reg";
    }

>>>>>>> origin/master
}
