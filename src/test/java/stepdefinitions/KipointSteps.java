package stepdefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import initialize.LaunchBrowser;

public class KipointSteps extends LaunchBrowser  {
	
	public KipointSteps()
	{
		Initialize();
	}
	
	
	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_and_password(String uname, String password) 
	{
	   lpm.KPLoginCredentials(driver, uname,password);
	} 
	
	@And("^User click on \"([^\"]*)\" Link$")
	public void user_click_on_Link(String arg1) throws Throwable {
	    
	    driver.findElement(By.partialLinkText(arg1)).click();
	}

	@And("^User select codice Promozionale \"([^\"]*)\"$")
	public void user_select_codice_Promozionale(String arg1) throws Throwable {
	    cpm.SelectCodicePromozioneDropdown(driver, arg1);
	    
	}

	@And("^User Enter \"([^\"]*)\" codice Promozionale$")
	public void user_Enter_codice_Promozionale(String arg1) throws Throwable {
	    
	    cpm.EnterCodicePromo(driver, arg1);
	}
	
	@And("^User click on Si Button$")
	public void click_on_Si_button(){
		om.ClickSiButton(driver);
	}

}
