package page.methods;

import org.openqa.selenium.WebDriver;

import page.objects.Orderpage;
import util.Utility;

public class OrderMethod extends Utility{
	
	Orderpage op = new Orderpage();
	
	public String GetOrderId(WebDriver driver)
	{
		ExplicitlyWaitForElement(driver, op.OrderIdText(driver));
		return op.OrderIdText(driver).getText();
	}
	
	public void ClickDocumentazione(WebDriver driver) throws InterruptedException
	{
		ExplicitlyWaitForElement(driver, op.DocumentazioneButton(driver));
		//op.DocumentazioneButton(driver).click();
		Thread.sleep(8000);
		String parentHandle = driver.getWindowHandle();
		op.DocumentazioneButton(driver).click();
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		}
		//ExplicitlyWait(driver);
		driver.close();
		//Thread.sleep(2000);
		driver.switchTo().window(parentHandle);	
	}
	
	public void ClickSiButton(WebDriver driver)
	{
		op.SiButton(driver).click();
	}
	

}
