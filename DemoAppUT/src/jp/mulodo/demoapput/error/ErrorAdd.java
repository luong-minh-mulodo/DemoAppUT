package jp.mulodo.demoapput.error;

public class ErrorAdd extends ErrorBase{
	private static MyError myError = null; // var sington MyError.
	
	@Override
	public MyError ErrorException() {
		return getInstance();
	}
	
	/***
	 * get error add
	 * If equal null will create else return var static myError
	 * @return void
	 */
	public MyError getInstance()
	{
		if (myError == null)
		{
			final String errorCode = "002";
			final String errorMessage = "Empty or duplicate Filed";
			myError = new MyError(errorCode,errorMessage);
		}
		return myError;
	}

}
