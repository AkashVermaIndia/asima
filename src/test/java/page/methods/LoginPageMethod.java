package page.methods;

import org.openqa.selenium.WebDriver;

import page.objects.LoginPage;


	
public class LoginPageMethod {
	LoginPage lp = new LoginPage();
	public void KPLoginCredentials(WebDriver driver, String uname, String password)
	{
		
		lp.LoginNameField(driver).sendKeys(uname);
		lp.LoginPasswordField(driver).sendKeys(password);
		
	} 
}
