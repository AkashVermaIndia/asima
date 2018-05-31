package stepdefinitions;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import initialize.LaunchBrowser;


public class CrmOrederCreation extends LaunchBrowser {
	String cfPath  = System.getProperty("user.dir")+"\\ScreenImages\\CRMConsumerCreation\\" ;
	Screen s = new Screen();
	public CrmOrederCreation() {
		// TODO Auto-generated constructor stub
		Initialize();
	}
	
	@Given("^Launched CRM in browser$")
	public void launched_CRM_in_browser() throws Throwable {
		getDriver("ie");
		driver.get("http://172.16.191.249/sales_ita/start.swe?");
	}

	@When("^User Login into siebel$")
	public void user_Login_into_siebel() throws Throwable {
		cfm.SiebelLogin(driver);
	}
	
	@And("^Click on \"([^\"]*)\"$")
	public void click_on_Cliente(String arg) throws Throwable {
	   // Thread.sleep(3000);
	    if (arg.equalsIgnoreCase("ProfilePayment")) {
	    	s.wheel(cfPath+arg+".png", 10, 5);
		}
	    else if (arg.equalsIgnoreCase("OK")) {
			Thread.sleep(2000);
		}
	    else if (arg.equalsIgnoreCase("Eseguito")) {
			Thread.sleep(3000);
		}
		ut.WaitAndClick(cfPath+arg+".png");
	}
	@And("^Enter Codice fiscale in \"([^\"]*)\"$")
	public void enter_Codice_fiscale_in_search_field(String arg1) throws Throwable {
	    ut.WaitAndType(cfPath+arg1+".png", cfm.GetProperty("CodiceFiscale"));
	}
	
	@And("^Select \"([^\"]*)\" as \"([^\"]*)\"$")
	public void select_metodo_di_pagamento(String arg,String arg1) throws Throwable {
	  
		 ut.WaitAndClick(cfPath+arg+".png");
		 Thread.sleep(3000);
	   ut.WaitAndClick(cfPath+arg1+".png");
	}
	@Given("^Enter Inizia Con in \"([^\"]*)\"$")
	public void enter_Inizia_Con_in(String arg1) throws Throwable {
	   ut.WaitAndType(cfPath+arg1+".png", "C"+"o"+"n"+" "+"N"+"o"+"i"+Key.ENTER);
	   
	}
	
	@Then("^Stato should be In Transit$")
	public void stato_should_be_In_Transit() throws Throwable {
		Thread.sleep(18000);
		if(ut.findImage(cfPath, "StateInTransit.png")) {
			System.out.println("THE END....!!!!!");
		}
	}

}
