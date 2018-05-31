package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatiClientePage {
	
	private By _txtREANumberField = By.xpath("//input[contains(@id,'PersoInfo_txtREANumber')]");
	private By _emailIdField = By.xpath("//input[contains(@id,'PersoInfo_txtEmailFirst')]");
	private By _emailDomainField = By.xpath("//input[contains(@id,'PersoInfo_txtEmailLast')]");
	private By _accessCheckbox = By.xpath("//span[text()='Accetto']/preceding-sibling::input[@type='checkbox']");
	private By _denominazioneAzienda = By.xpath("//input[contains(@id,'_txtCompanyName')]");
	private By _tipoDocumentoDropdown=  By.xpath("//select[contains(@id,'PersoInfo_ddlDocumentTypeRef')]");
	private By _numeroDocumentoField = By.xpath("//input[contains(@id,'PersoInfo_txtDocumentNumberRef')]");
	private By _datadiRilascioField = By.xpath("//input[contains(@id,'PersoInfo_txtDocumentIssueDateRef')]");
	private By _expiryDateField = By.xpath("//input[contains(@id,'_PersoInfo_txtDocumentExpirationDateRef')]");
	private By _entediRilascio = By.xpath("//input[contains(@id,'PersoInfo_txtDocumentIssuingInstitutionRef')]");
	private By _luogodiRilascio = By.xpath("//input[contains(@id,'PersoInfo_txtDocumentIssuingPlaceRef')]");
	
	public WebElement TextREANumberField(WebDriver driver)
	{
		return driver.findElement(_txtREANumberField);
	}
	public WebElement EmailIdField(WebDriver driver)
	{
		return driver.findElement(_emailIdField);
	}
	
	public WebElement EmailDomainField(WebDriver driver)
	{
		return driver.findElement(_emailDomainField);
	}
	
	public WebElement AccessCheckbok(WebDriver driver)
	{
		return driver.findElement(_accessCheckbox);
	}
	public WebElement DenominazioneAzienda(WebDriver driver)
	{
		return driver.findElement(_denominazioneAzienda);
	}
	public WebElement TipoDocumentoDropdown(WebDriver driver)
	{
		return driver.findElement(_tipoDocumentoDropdown);
	}
	
	public WebElement NumeroDocumentoField(WebDriver driver)
	{
		return driver.findElement(_numeroDocumentoField);
	}
	public WebElement DatadiRilascioField(WebDriver driver)
	{
		return driver.findElement(_datadiRilascioField);
	}
	public WebElement ExpiryDateField(WebDriver driver)
	{
		return driver.findElement(_expiryDateField);
	}
	public WebElement EntediRilascio(WebDriver driver)
	{
		return driver.findElement(_entediRilascio);
	}
	public WebElement LuogodiRilascio(WebDriver driver)
	{
		return driver.findElement(_luogodiRilascio);
	}
	
	
}
