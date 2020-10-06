package by.tms.services.exception;

public class NotFoundOperationsByUserIdException extends RuntimeException {
    public NotFoundOperationsByUserIdException() {
    }

    public NotFoundOperationsByUserIdException(String message) {
        super(message);
    }

    public NotFoundOperationsByUserIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundOperationsByUserIdException(Throwable cause) {
        super(cause);
    }

    public NotFoundOperationsByUserIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    @Override
    public String getMessage() {
        return "Not found operations for user with such id!";
    }
}
