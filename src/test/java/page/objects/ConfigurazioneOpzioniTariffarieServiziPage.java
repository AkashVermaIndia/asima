package page.objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurazioneOpzioniTariffarieServiziPage {
	
	private By _ricaricaText = By.xpath("//span[text()='Ricarica']");
	private By _acquistoPrimaRicaricaCheckbox = By.xpath("//input[contains(@id,'AcquistoPrimaRicarica')]");
	private By _taglioRicaricaDropdown =  By.xpath("//select[contains(@id,'ddlTagliRicarica')]");
	private By _tableCheckboxes = By.xpath("//table[@id='WebPart_SelectOptionOrderConfigPart1']");
	private By _initialCreditText = By.xpath("//span[contains(@id,'txtInitialCredit')]");
	
	List<WebElement> list = new ArrayList<WebElement>();
	public WebElement RicaricaText(WebDriver driver) {
		return driver.findElement(_ricaricaText);
		
	}
	public WebElement AcquistoPrimaRicaricaCheckbox(WebDriver driver) {
		return driver.findElement(_acquistoPrimaRicaricaCheckbox);
	}
	public WebElement TaglioRicaricaDropdown(WebDriver driver) {
		return driver.findElement(_taglioRicaricaDropdown);
	}
	
	public List<WebElement> GetTableCheckboxes(WebDriver driver)
	{
		WebElement element = driver.findElement(_tableCheckboxes);
		//list = element.findElements(By.tagName("input"));
		list = element.findElements(By.xpath("//span[@class='aspNetDisabled']/input[@type='checkbox']"));
		System.out.println(list.size());
		return list;
	}
	public WebElement InitialCreditText(WebDriver driver) {
		return driver.findElement(_initialCreditText);
	}
	

}
