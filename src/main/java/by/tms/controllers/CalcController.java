package by.tms.controllers;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.entity.dto.OperationCalcDto;
import by.tms.services.CalcService;
import by.tms.services.OperationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping(path = "calc")
public class CalcController {
    private CalcService calcService;
    private OperationService operationService;

    public CalcController(CalcService calcService, OperationService operationService) {
        this.calcService = calcService;
        this.operationService = operationService;
    }

    @GetMapping
    public String getCalcForm(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/home";
        }
        model.addAttribute("operationDto", new OperationCalcDto());
        return "calc";
    }

    @PostMapping
    public ModelAndView getCalcResult(@Valid @ModelAttribute(name = "operationDto") OperationCalcDto operationCalcDto, BindingResult bindingResult, ModelAndView modelAndView, @SessionAttribute("user") User user) {
        if (!bindingResult.hasErrors()) {
            double result = calcService.calc(operationCalcDto);
            operationService.createOperation(new Operation(user.getId(), operationCalcDto.getNum1(), operationCalcDto.getNum2(), operationCalcDto.getOperationType(), result));
            modelAndView.addObject("result", result);
        }
        modelAndView.setViewName("calc");
        return modelAndView;
    }
}
