package kumar.test.exception;

public class StorePoException extends Exception {

	
	private static final long serialVersionUID = 1L;
	private String errMessage;
	private Throwable exception;
	
	public StorePoException() {
		super();
	}
	
	public StorePoException (String errMsg, Throwable exception) {
		super(errMsg,exception);
	}

	/**
	 * @return the errMessage
	 */
	public String getErrMessage() {
		return errMessage;
	}

	/**
	 * @param errMessage the errMessage to set
	 */
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	/**
	 * @return the exception
	 */
	public Throwable getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(Throwable exception) {
		this.exception = exception;
	}
	
}
