package by.tms.services;

<<<<<<< HEAD
import by.tms.entity.dto.OperationCalcDto;
import by.tms.services.exception.UnsupportedCalcOperationException;
=======
import by.tms.entity.Operation;
>>>>>>> origin/master
import org.springframework.stereotype.Service;

@Service
public class CalcService {

<<<<<<< HEAD
    public double calc(OperationCalcDto operationCalcDto) {
        switch (operationCalcDto.getOperationType()) {
            case "SUM" -> {
                return operationCalcDto.getNum1() + operationCalcDto.getNum2();
            }
            case "SUB" -> {
                return operationCalcDto.getNum1() - operationCalcDto.getNum2();
            }
            case "MUL" -> {
                return operationCalcDto.getNum1() * operationCalcDto.getNum2();
            }
            case "DIV" -> {
                if (operationCalcDto.getNum2() == 0) {
                    throw new ArithmeticException("Cen not division by zero!");
                }
                return operationCalcDto.getNum1() / operationCalcDto.getNum2();
            }
            default -> throw new UnsupportedCalcOperationException();
=======
    public double calc(String operationType, double num1, double num2) {
        switch (operationType) {
            case "SUM" -> {
                return num1 + num2;
            }
            case "SUB" -> {
                return num1 - num2;
            }
            case "MUL" -> {
                return num1 * num2;
            }
            case "DIV" -> {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                return num1 / num2;
            }
            default -> throw new UnsupportedOperationException("Operation not found!");
>>>>>>> origin/master
        }
    }
}
