package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurazioneOrdinediVenditaPage {

	private By _tipologiaSIMDropdown = By.xpath("//select[contains(@id,'configuration_ddlTipologiaSim')]");
	private By _barCodeSIMCardField = By.xpath("//input[contains(@id,'configuration_txtBarCode')]");
	private By _offertaDropDown =  By.xpath("//select[contains(@id,'configuration_ddlTypesOfClient')]");
	private By _pianoTariffarioDropdown= By.xpath("//select[contains(@id,'configuration_ddlPlanTariff')]");
	
	public WebElement TipologiaSimDropdown(WebDriver driver) {
		return driver.findElement(_tipologiaSIMDropdown);
		
	}
	public WebElement BarcodeSimcardField(WebDriver driver) {
		return driver.findElement(_barCodeSIMCardField);
	}
	public WebElement OffertaDropdown(WebDriver driver) {
		return driver.findElement(_offertaDropDown);
	}
	public WebElement PianoTariffarioDropdown(WebDriver driver) {
		return driver.findElement(_pianoTariffarioDropdown);
		
	}
}
