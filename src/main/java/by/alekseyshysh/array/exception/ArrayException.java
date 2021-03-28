package by.alekseyshysh.array.exception;

public class ArrayException extends Exception {
	@java.io.Serial
	private static final long serialVersionUID = -3303790395502061392L;

	public ArrayException() {
        super();
    }
	
	public ArrayException(String message) {
        super(message);
    }
	
    public ArrayException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ArrayException(Throwable cause) {
        super(cause);
    }
}
