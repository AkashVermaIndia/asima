package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodiceFiscalePage {
	
	private By _lastNameField = By.id("cg");
	private By _firstNameField = By.id("nm");
	private By _placeOfBirthField = By.id("lg");
	private By _dateOfBirthField = By.id("dn");
	private By _genderDropdown = By.xpath("//select[@name='ss']");
	private By _generateButton = By.xpath("//div[@id='ku']/button");
	private By _copyButton = By.xpath("//div[@id='ku']/button[text()='Copy']");
	private By _generatedCFField = By.xpath("//input[@id='ccf']");
	
	public WebElement LastNameField(WebDriver driver)
	{
		return driver.findElement(_lastNameField);
	}
	
	public WebElement FirstNameField(WebDriver driver)
	{
		return driver.findElement(_firstNameField);
	}
	
	public WebElement PlaceOfBirth(WebDriver driver)
	{
		return driver.findElement(_placeOfBirthField);
	}
	
	public WebElement DateOfBirth(WebDriver driver)
	{
		return driver.findElement(_dateOfBirthField);
	}
	
	public WebElement GenderDropdown(WebDriver driver)
	{
		return driver.findElement(_genderDropdown);
	}
	
	public WebElement GenerateButton(WebDriver driver)
	{
		return driver.findElement(_generateButton);
	}
	
	public WebElement CopyButton(WebDriver driver)
	{
		return driver.findElement(_copyButton);
	}
	
	public WebElement GeneratedCFField(WebDriver driver)
	{
		return driver.findElement(_generatedCFField);
	}
}
