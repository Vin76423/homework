package by.tms.services.exception;

public class UnsupportedCalcOperationException extends UnsupportedOperationException {
    public UnsupportedCalcOperationException() {
    }

    public UnsupportedCalcOperationException(String message) {
        super(message);
    }

    public UnsupportedCalcOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedCalcOperationException(Throwable cause) {
        super(cause);
    }


    @Override
    public String getMessage() {
        return "Calc operation not found!";
    }
}
