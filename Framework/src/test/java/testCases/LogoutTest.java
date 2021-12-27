package testCases;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

	@Test
	public void verifyLoginPage() throws InterruptedException
	{
		logout.verifyLogout();
	}
}
