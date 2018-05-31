package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orderpage {
	
	private By _orderIdText = By.xpath("//span[contains(@id,'txtCodeOrder')]");
	private By _documentazioneButton = By.xpath("//a[text()='Documentazione']");
	private By _siButton = By.xpath("//span[text()='Si']");
	
	public WebElement OrderIdText(WebDriver driver)
	{
		return driver.findElement(_orderIdText);
	}
	
	public WebElement DocumentazioneButton(WebDriver driver)
	{
		return driver.findElement(_documentazioneButton);
	}	
	
	public WebElement SiButton(WebDriver driver)
	{
		return driver.findElement(_siButton);
	}

	
}
