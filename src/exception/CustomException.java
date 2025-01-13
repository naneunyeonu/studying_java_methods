package exception;
/*
기본 예외 클래스를 상속받고, 새로운 예외 클래스를 정의.
*/

public class CustomException extends Exception {
    private String errorCode;

    public CustomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public String getErrorCode() {
        return errorCode;
    }
}

