package _14_Exceptions;

public class SchupiMiSeKitkataException extends Exception {
	
	private static final long serialVersionUID = 9029443445621566889L;

	public SchupiMiSeKitkataException() {
		super();
	}

	public SchupiMiSeKitkataException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SchupiMiSeKitkataException(String message, Throwable cause) {
		super(message, cause);
	}

	public SchupiMiSeKitkataException(String message) {
		super(message);
	}

	public SchupiMiSeKitkataException(Throwable cause) {
		super(cause);
	}
}