package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Utility {
	WebDriverWait wait;
	public  Screen s = new Screen();
	public  Pattern image;
	Properties props = new Properties();
	File f = new File("Input\\codicefiscale.properties");
	
	public WebElement ClickAvanti(String buttonName, WebDriver driver)
	{
		String button = "//a[contains(@id,'"+buttonName+"')]";
		return driver.findElement(By.xpath(button));
	}
	
	public void AcceptAlert(WebDriver driver)
	{
		ExplicitlyWaitForAlert(driver);
		driver.switchTo().alert().accept();
		
	}
	
	public void ExplicitlyWaitForAlert(WebDriver driver) {
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void ExplicitlyWaitForElement(WebDriver driver, WebElement element)
	{
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
	public  void WaitAndClick(String cfPath) throws FindFailed, InterruptedException
	{
		Thread.sleep(5000);
		s.find(cfPath);
		image = new Pattern(cfPath);		
		s.wait(image,10);
		s.click(image);
	}
	
	public  void WaitAndType(String cfPath, String value) throws FindFailed, InterruptedException
	{
		Thread.sleep(5000);
		s.find(cfPath);
		image = new Pattern(cfPath);		
		s.wait(image, 10);
		s.type(image, value);
	
	}	

	public boolean findImage(String path, String imageName) throws FindFailed {
		boolean flag = false;
		if(s.find(path+imageName) != null) {
			flag = true;
		}
		return flag;
	}
	public void SiebelLogin(WebDriver driver)
	{
		driver.findElement(By.name("SWEUserName")).sendKeys("CC_CONS");
		driver.findElement(By.name("SWEPassword")).sendKeys("CC_CONS");
		driver.findElement(By.xpath("//img[@alt='Login']")).click();
	}
	
	public void SetProperty(String codiceFiscal) throws IOException
	{
		props.setProperty("CodiceFiscale", codiceFiscal);
        OutputStream out = new FileOutputStream( f );
        props.store(out, "");		
	}
	
	public String GetProperty(String key) throws IOException {
		
		 InputStream is  = new FileInputStream( f );
	     props.load(is);
	     return props.getProperty(key);
	}

}
