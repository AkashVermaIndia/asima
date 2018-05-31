package page.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import page.objects.CodicePromozionalePage;

public class CodicePromozionaleMethod {
	CodicePromozionalePage cp = new CodicePromozionalePage();
	Select select;
	
	public void SelectCodicePromozioneDropdown(WebDriver driver, String arg1)
	{
		select = new Select(cp.CodicePromozioneDropdown(driver));
		select.selectByVisibleText(arg1);
	}

	public void EnterCodicePromo(WebDriver driver, String arg1)
	{
		cp.CodicePromoField(driver).sendKeys(arg1);
	}
}
