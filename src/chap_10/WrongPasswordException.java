package chap_10;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
