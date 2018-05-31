package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RicercaClientePage 
{
	private By _tipologiaClienteDropdown = By.xpath("//select[contains(@id,'ClientType')]");
	private By _codiceFiscaleField = By.xpath("//input[contains(@id,'txtPersonalId')]");
	private By _partIvaField = By.xpath("//input[contains(@id,'txtPiva')]");
	private By _tipologiaOffertaDropdown = By.xpath("//select[contains(@id,'SearchClientPart')]");
	
	
	public WebElement TipologiaClienteDropdown(WebDriver driver)
	{
		return driver.findElement(_tipologiaClienteDropdown);
	}
	
	public WebElement CodiceFiscaleField(WebDriver driver)
	{
		return driver.findElement(_codiceFiscaleField);
	}
	
	public WebElement PartIvaField(WebDriver driver)
	{
		return driver.findElement(_partIvaField);
	}
	
	public WebElement TipologiOffertaDropdown(WebDriver driver)
	{
		return driver.findElement(_tipologiaOffertaDropdown);
	}
		

}
