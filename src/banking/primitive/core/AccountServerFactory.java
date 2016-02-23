package banking.primitive.core;

/*
	File: AccountServerFactory.java	
	Author:	K Gary
	Date:	2/22/15

	Description: create and returns ServerSolution object
*/
public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
