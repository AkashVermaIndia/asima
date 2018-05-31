package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodicePromozionalePage {
	private By _codicePromozioneDropdown= By.xpath("//select[contains(@id,'PromotionalCodeID_ddlPromotionList')]");
	private By _codicePromoField = By.xpath("//input[contains(@id,'PromotionalCodeID_txtPromotionCode')]");

	public WebElement CodicePromozioneDropdown(WebDriver driver) {
		return driver.findElement(_codicePromozioneDropdown);
		
	}
	public WebElement CodicePromoField(WebDriver driver) {
		return driver.findElement(_codicePromoField);
	}
	
}
