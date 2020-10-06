package by.tms.entity;

<<<<<<< HEAD
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class Operation {
    private static long idInc = 1;
    private long id = idInc++;
    private Date date = new Date();
    private long userId;
=======
public class Operation {
>>>>>>> origin/master
    private double num1;
    private double num2;
    private String operationType;
    private double result;

<<<<<<< HEAD
    public Operation(long userId, double num1, double num2, String operationType, double result) {
        this.userId = userId;
=======
    public Operation(double num1, double num2, String operationType, double result) {
>>>>>>> origin/master
        this.num1 = num1;
        this.num2 = num2;
        this.operationType = operationType;
        this.result = result;
    }

<<<<<<< HEAD
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

=======
>>>>>>> origin/master
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

<<<<<<< HEAD
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", userId=" + userId +
                ", num1=" + num1 +
=======
    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
>>>>>>> origin/master
                ", num2=" + num2 +
                ", operationType='" + operationType + '\'' +
                ", result=" + result +
                '}';
    }
}
