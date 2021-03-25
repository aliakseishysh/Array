package by.alekseyshysh.array.exception;

public class NoSuchFileFoundedException extends Exception {

	public NoSuchFileFoundedException() {
        super();
    }
	
	public NoSuchFileFoundedException(String message) {
        super(message);
    }
	
    public NoSuchFileFoundedException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public NoSuchFileFoundedException(Throwable cause) {
        super(cause);
    }
	
}
