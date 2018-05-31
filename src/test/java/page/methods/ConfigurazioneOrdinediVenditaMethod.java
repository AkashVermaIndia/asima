package page.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.ConfigurazioneOrdinediVenditaPage;
import util.Utility;

public class ConfigurazioneOrdinediVenditaMethod extends Utility {
	
	ConfigurazioneOrdinediVenditaPage covp = new ConfigurazioneOrdinediVenditaPage();
	Select select;
	public void SelectTipologia(WebDriver driver, String arg1)
	{
		ExplicitlyWaitForElement(driver, covp.TipologiaSimDropdown(driver));
		select = new Select(covp.TipologiaSimDropdown(driver));
		select.selectByVisibleText(arg1);
	}
	
	public void EnterBarcode(WebDriver driver, String arg1)
	{
		covp.BarcodeSimcardField(driver).sendKeys(arg1);
	}
	
	public void SelectOffert_Pianotariffo(WebDriver driver, String arg1, String arg2)
	{
		select = new Select(covp.OffertaDropdown(driver));
		select.selectByVisibleText(arg1);
		select = new Select(covp.PianoTariffarioDropdown(driver));
		select.selectByVisibleText(arg2);
	}

}
