package mainJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	protected ChromeOptions options;
	protected LoginPage login;
	protected LogoutPage logout;
	
	protected WebDriverWait wait;
	public void waitfor(int seconds)
	{
		wait=new WebDriverWait(driver,50);
		wait.withTimeout(seconds,TimeUnit.SECONDS);
	}
}
