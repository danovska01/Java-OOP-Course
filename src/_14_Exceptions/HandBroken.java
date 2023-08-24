package _14_Exceptions;

public class HandBroken extends Exception {
	
	private static final long serialVersionUID = 9029443445621566889L;

	public HandBroken() {
		super();
	}

	public HandBroken(String message, Throwable cause, boolean enableSuppression,
					  boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HandBroken(String message, Throwable cause) {
		super(message, cause);
	}

	public HandBroken(String message) {
		super(message);
	}

	public HandBroken(Throwable cause) {
		super(cause);
	}
}