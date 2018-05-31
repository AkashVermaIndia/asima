package page.methods;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import page.objects.RicercaClientePage;

public class RicercaClienteMethod {
	
	Select select;
	RicercaClientePage rcp = new RicercaClientePage();
	CodiceFiscaleMethod cfm = new CodiceFiscaleMethod();
	Actions action;
	public void SelectTipologiaCliente(WebDriver driver, String arg1)
	{
		select = new Select(rcp.TipologiaClienteDropdown(driver));
		select.selectByVisibleText(arg1);
		
	}
	
	public void EnterCodiceFiscale(WebDriver driver, String arg1) throws IOException
	{
		//rcp.CodiceFiscaleField(driver).sendKeys(cfm.GetProperty("CodiceFiscale"));
		//rcp.CodiceFiscaleField(driver).sendKeys("DMRNGL90A01F839G");
		//rcp.CodiceFiscaleField(driver).sendKeys("CHYSFL85D57F839X");
		rcp.CodiceFiscaleField(driver).sendKeys(arg1);
		
	}
	
	public void EnterPartIva(WebDriver driver, String arg1)
	{
		Random random = new Random();
		//logic to create PartIva
		int n = 100 + random.nextInt(999);
		String partIva = "1234"+n+"063"+"1";
		System.out.println(partIva);
		//rcp.PartIvaField(driver).sendKeys("12341490634");
		//rcp.PartIvaField(driver).sendKeys("12348760633");
		rcp.PartIvaField(driver).sendKeys(arg1);
		
	}
	
	public void SelectTipologiaOfferta(WebDriver driver, String arg1)
	{
		action  = new Actions(driver);
		action.moveToElement(rcp.TipologiOffertaDropdown(driver)).click();
		driver.findElement(By.xpath("//option[text()='"+arg1+"']")).click();		
		
	}
	
	
	

}
