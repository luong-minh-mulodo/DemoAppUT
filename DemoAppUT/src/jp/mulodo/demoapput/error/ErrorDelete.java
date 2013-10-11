package jp.mulodo.demoapput.error;

public class ErrorDelete extends ErrorBase{
	private static MyError myError = null; // var sington MyError.
	
	@Override
	public MyError ErrorException() {
		return getInstance();
	}
	
	/***
	 * get error login
	 * If equal null will create else return var static myError
	 * @return void
	 */
	public MyError getInstance()
	{
		if (myError == null)
		{
			final String errorCode = "003";
			final String errorMessage = "Can not delete because item null";
			myError = new MyError(errorCode,errorMessage);
		}
		return myError;
	}

}
