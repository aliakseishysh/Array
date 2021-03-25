package by.alekseyshysh.array.exception;

// TODO can't use standard IndexOutOfRangeException, but it's most proper name
public class IndexOutOfRangeFoundedException extends Exception {

	public IndexOutOfRangeFoundedException() {
        super();
    }
	
	public IndexOutOfRangeFoundedException(String message) {
        super(message);
    }
	
    public IndexOutOfRangeFoundedException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public IndexOutOfRangeFoundedException(Throwable cause) {
        super(cause);
    }
}
