package page.methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.DatiClientePage;
import util.Utility;

public class DatiClienteMethods extends Utility{
	
	DatiClientePage dcp = new DatiClientePage();
	Select select;
	
	public void EnterNumeroRea(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver,dcp.EmailIdField(driver));
		dcp.TextREANumberField(driver).clear();
		
		dcp.TextREANumberField(driver).sendKeys("1");
		
	}
	
	public void EnterEmail(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver,dcp.EmailIdField(driver));
		dcp.EmailIdField(driver).clear();
		dcp.EmailDomainField(driver).clear();
		dcp.EmailIdField(driver).sendKeys("test");
		dcp.EmailDomainField(driver).sendKeys("@test.com");
		
	}
	
	public void EnterCompanyName(WebDriver driver)
	{
		//ExplicitlyWaitForElement(driver,dcp.DenominazioneAzienda(driver));
		dcp.DenominazioneAzienda(driver).clear();
		
		dcp.DenominazioneAzienda(driver).sendKeys("accenture");
		
	}
	
	public void SelectTipoDocument(WebDriver driver, String arg1)
	{
		ExplicitlyWaitForElement(driver, dcp.TipoDocumentoDropdown(driver));
		select = new Select(dcp.TipoDocumentoDropdown(driver));
		select.selectByVisibleText(arg1);
	}
	
	public void EnterNumberofDocument(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver,dcp.NumeroDocumentoField(driver));
		
		dcp.NumeroDocumentoField(driver).sendKeys("1");
		
	}
	public void EnterStartDate(WebDriver driver) throws InterruptedException
	{
		//Date d = new Date(2014,04,01);
		//d.
		ExplicitlyWaitForElement(driver,dcp.DatadiRilascioField(driver));
		//dcp.DatadiRilascioField(driver).clear();
		//Thread.sleep(5000);
		dcp.DatadiRilascioField(driver).click();
		ExplicitlyWaitForElement(driver,dcp.DatadiRilascioField(driver));
		dcp.DatadiRilascioField(driver).sendKeys(Keys.BACK_SPACE);
		dcp.DatadiRilascioField(driver).sendKeys(Keys.BACK_SPACE);
		dcp.DatadiRilascioField(driver).sendKeys("01");
		dcp.DatadiRilascioField(driver).sendKeys("04");
		dcp.DatadiRilascioField(driver).sendKeys("2014");
		//dcp.DatadiRilascioField(driver).sendKeys();
		
	}
	public void EnterExpiryDate(WebDriver driver) throws InterruptedException
	{
		ExplicitlyWaitForElement(driver,dcp.ExpiryDateField(driver));
		//dcp.ExpiryDateField(driver).clear();
		//Thread.sleep(5000);
		dcp.ExpiryDateField(driver).click();
		dcp.ExpiryDateField(driver).sendKeys(Keys.BACK_SPACE);
		dcp.ExpiryDateField(driver).sendKeys(Keys.BACK_SPACE);
		dcp.ExpiryDateField(driver).sendKeys("01");
		dcp.ExpiryDateField(driver).sendKeys("04");
		dcp.ExpiryDateField(driver).sendKeys("2024");
		
		
	}
	public void EnterIssuingInstitutename(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver,dcp.EntediRilascio(driver));
		
		dcp.EntediRilascio(driver).sendKeys("commune");
		
	}
	public void EnterPlace(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver,dcp.LuogodiRilascio(driver));
		
		dcp.LuogodiRilascio(driver).sendKeys("Napoli");
		
	}
	public void CheckAccessto(WebDriver driver)
	{
		dcp.AccessCheckbok(driver).click();
	}

}
