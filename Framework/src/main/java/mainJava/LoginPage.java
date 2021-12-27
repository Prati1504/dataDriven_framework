package mainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

	WebDriver driver;
	
	@FindBy(id="txtUsername") protected WebElement username;
	@FindBy(id="txtPassword") protected WebElement password;
	@FindBy(id="btnLogin") protected WebElement btnlogin;

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void verifyLogin()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();
	}
	
	
}
