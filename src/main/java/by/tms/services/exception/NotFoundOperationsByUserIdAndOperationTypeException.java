package by.tms.services.exception;

public class NotFoundOperationsByUserIdAndOperationTypeException extends RuntimeException {
    public NotFoundOperationsByUserIdAndOperationTypeException() {
    }

    public NotFoundOperationsByUserIdAndOperationTypeException(String message) {
        super(message);
    }

    public NotFoundOperationsByUserIdAndOperationTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundOperationsByUserIdAndOperationTypeException(Throwable cause) {
        super(cause);
    }

    public NotFoundOperationsByUserIdAndOperationTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    @Override
    public String getMessage() {
        return "Not found operations for user with such id and ded such operation!";
    }
}
