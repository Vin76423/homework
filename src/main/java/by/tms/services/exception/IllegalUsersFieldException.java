package by.tms.services.exception;

public class IllegalUsersFieldException extends IllegalArgumentException {
    public IllegalUsersFieldException() {
    }

    public IllegalUsersFieldException(String s) {
        super(s);
    }

    public IllegalUsersFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalUsersFieldException(Throwable cause) {
        super(cause);
    }


    @Override
    public String getMessage() {
        return "Such field is not in User.class!";
    }
}
