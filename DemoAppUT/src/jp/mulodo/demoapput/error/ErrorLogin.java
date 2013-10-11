package jp.mulodo.demoapput.error;

public class ErrorLogin extends ErrorBase{

	private static final long serialVersionUID = 1L;
	private static MyError myError = null; // var sington MyError.
	
	public ErrorLogin()
	{
		getInstance();
	}
	
	@Override
	public MyError ErrorException() {
		return myError;
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
			final String errorCode = "001";
			final String errorMessage = "User name or password not correct";
			myError = new MyError(errorCode,errorMessage);
		}
		return myError;
	}

}
