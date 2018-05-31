package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private By _loginNameField = By.xpath("//input[contains(@id,'txtUsername')]");
	private By _loginPasswordField = By.xpath("//input[contains(@id,'txtPassword')]");

	public WebElement LoginNameField(WebDriver driver)
	{
		return driver.findElement(_loginNameField);
	}
	
	public WebElement LoginPasswordField(WebDriver driver)
	{
		return driver.findElement(_loginPasswordField);
	}	
}
