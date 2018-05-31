package page.methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import page.objects.ConfigurazioneOpzioniTariffarieServiziPage;
import util.Utility;

public class ConfigurazioneOpzioniTariffarieServiziMethod extends Utility{
	
	ConfigurazioneOpzioniTariffarieServiziPage cotsp = new ConfigurazioneOpzioniTariffarieServiziPage();
	Select select;
	public void ClickRicaricaText(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver, cotsp.RicaricaText(driver));
		cotsp.RicaricaText(driver).click();;
	}
	
	public void ClickAcquistoPrimaRicaricaCheckbox(WebDriver driver)
	{
		cotsp.AcquistoPrimaRicaricaCheckbox(driver).click();
		
	}
	
	public void SelectTaglioRicaricaDropdown(WebDriver driver)
	{
		List<WebElement> list = new ArrayList<WebElement>();
		list = cotsp.GetTableCheckboxes(driver);
		System.out.println(list.size());
		double price = 0;
		int i=1;
		
		for(WebElement element:list)
		{
			//System.out.println(element.findElement(By.xpath("(//parent::span[@class='aspNetDisabled']/following-sibling::span[1])["+i+"]")).getText());
			
			String num = element.findElement(By.xpath("(//span[@class='aspNetDisabled']/parent::td/following-sibling::td[2]/span/span)["+i+"]")).getText();
			price = price+Double.parseDouble(num);
			System.out.println(price);
			i++;
			
		}
		Double initialPrice = Double.parseDouble(cotsp.InitialCreditText(driver).getText());
		if((initialPrice<price))
		{
	
			if((price-initialPrice)>1 && (price-initialPrice)<20)
			{
				Amount(driver,"20");
			}
			else if((price-initialPrice)>20 &&(price-initialPrice)<35)
			{
				Amount(driver,"35");
			}
			else if((price-initialPrice)>35 &&(price-initialPrice)<60)
			{
				Amount(driver,"60");
			}
			else if((price-initialPrice)>60 &&(price-initialPrice)<100)
			{
				Amount(driver,"100");
			}
			else if((price-initialPrice)>100 &&(price-initialPrice)<150)
			{
				Amount(driver,"150");
			}
		}	
		
		System.out.println(initialPrice);
		
		
	}
	
	public void Amount(WebDriver driver, String amount)
	{
		select = new Select(cotsp.TaglioRicaricaDropdown(driver));
		select.selectByValue(amount);
	}
	

}
