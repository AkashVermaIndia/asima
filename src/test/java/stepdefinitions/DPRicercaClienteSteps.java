package stepdefinitions;

import java.io.IOException;


import org.sikuli.script.FindFailed;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import initialize.LaunchBrowser;
import junit.framework.Assert;


import util.Utility;

public class DPRicercaClienteSteps extends LaunchBrowser {

	public static String orderID;
	String Fiscal,barcode, codiceFiscale;		

	public DPRicercaClienteSteps() throws IOException 
	{			
		Initialize();
	}   
	
	
	Utility util = new Utility();
	
	@Given("^browser shoulde be launched$")
	public void browser_shoulde_be_launched() throws IOException {
	  getDriver("ie");
	}

	@And("^\"([^\"]*)\" portal should be launched$")
	public void url_should_be_entered(String arg1) {
		
		if(arg1.equalsIgnoreCase("DP"))
		{
			driver.get(prop.getProperty("DP"));
		}
		else if(arg1.equalsIgnoreCase("Ki point")) 
		{	
			driver.get(prop.getProperty("kipoint"));
		}
	}
	
	@Before("@codicefiscale")
	public void generateCodiceFiscale() throws IOException, FindFailed, InterruptedException
	{		
		cfm.GenerateCodiceDetail();		
		getDriver("chrome");
		driver.get(prop.getProperty("CFGenerator"));
		codiceFiscale = cfm.GenerateCodiceFiscale(driver);
		driver.close();
		driver = null;		
		getDriver("ie");
		driver.get(prop.getProperty("Siebel"));
		cfm.ActivateCodiceFiscale(driver);
		barcode = cfm.RetriveICCID(driver);
	}
	
	@Before("@barcode")
	public void Barcode() throws FindFailed, InterruptedException, IOException
	{
		getDriver("ie");
		driver.get("http://172.16.191.249/sales_ita/start.swe?");
		cfm.SiebelLogin(driver);
		barcode = cfm.RetriveICCID(driver);
	}
	

	@And("^Security check is done$")
	public void security_check_is_done() {
		
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");			
	}

	@When("^User select tipologia cliente as ([^\"]*)$")
	public void user_select_tipologia_cliente_as(String arg1) {
		rcm.SelectTipologiaCliente(driver,arg1);	
	}

	@And("^User enter CodiceFiscale$")
	public void user_enter_Codice_fiscal_in_Codice_Fiscale_tab() throws IOException {
		
		rcm.EnterCodiceFiscale(driver,cfm.GetProperty("CodiceFiscale"));
	}
	@And("^User enter \"([^\"]*)\" in Partita IVA tab$")
	public void user_enter_Partita_IVA_in_Partita_IVA_tab(String arg1) throws IOException {
	    
	    rcm.EnterPartIva(driver,arg1);
	}

	@And("^select ([^\"]*) from tipologia Offerta dropdown$")
	public void select_from_Tipologia_Offerta_dropdown(String arg1) 
	{		
		rcm.SelectTipologiaOfferta(driver, arg1);		
	}

	@And("^click on \"([^\"]*)\" Avanti$")
	public void click_on_Avanti(String buttonName) throws InterruptedException 
	{	
		Thread.sleep(3000);
		util.ClickAvanti(buttonName, driver).click();;	
		//Thread.sleep(2000);
	}
	
	@And("^User accept alert$")
	public void user_Accept_alert() throws InterruptedException
	{
		util.AcceptAlert(driver);
	}	
	@And("^User enter Numero REA$")
	public void user_enter_Numero_REA()  {
	   dcm.EnterNumeroRea(driver);
	}
	@And("^User enter EmailId$")
	public void user_enter_EmailId() throws InterruptedException {
		Thread.sleep(8000);
		dcm.EnterEmail(driver);
	}
	@And("^User enter Companyname$")
	public void user_enter_Companyname() throws Throwable {
	    
	    dcm.EnterCompanyName(driver);
	}
	
	@And("^User select \"([^\"]*)\" from dropdown documenttype$")
	public void user_select_from_dropdown_documenttype(String arg1 ) throws Throwable {
	    
	    dcm.SelectTipoDocument(driver, arg1);
	}

	@And("^user enter number of document$")
	public void user_enter_number_of_document() throws Throwable {
	    
	    dcm.EnterNumberofDocument(driver);
	}

	@And("^User enter start date$")
	public void user_enter_start_date() throws Throwable {
	    
	    dcm.EnterStartDate(driver);
	}

	@And("^User enter end date$")
	public void user_enter_end_date() throws Throwable {
	   
	    dcm.EnterExpiryDate(driver);
	}

	@And("^User enter Issuing Institute name$")
	public void user_enter_Issuing_Institute_name() throws Throwable {
	    
	    dcm.EnterIssuingInstitutename(driver);
	}

	@And("^User enter Place name$")
	public void user_enter_Place_name() throws Throwable {
	 
	   dcm.EnterPlace(driver);
	}
	
	@And("^User check the accetto checkbox$")
	public void user_check_the_accetto_checkbox() {
			dcm.CheckAccessto(driver);
	}
	
	@And("^User enter tipologia Sim as ([^\"]*)$")
	public void user_enter_tipologia_Sim(String arg1) throws InterruptedException {
		
		//Thread.sleep(3000);
		covm.SelectTipologia(driver, arg1);
	}

	@And("^User enter Barcode$")
	public void user_enter_Barcode_Simcard() throws FindFailed, InterruptedException {
		
		covm.EnterBarcode(driver,barcode);
		//covm.EnterBarcode(driver,"39334029000001864");
	}

	@And("^User select offerta as ([^\"]*) and Piano Tariffario as ([^\"]*)$")
	public void user_select_offerta_and_Piano_Tariffario(String arg1, String arg2) {
		covm.SelectOffert_Pianotariffo(driver, arg1, arg2);
	}	

	@And("^User select Acquisto prima ricarica$")
	public void user_select_Acquisto_prima_ricarica() throws InterruptedException {
		//Thread.sleep(3000);
		cotsm.ClickRicaricaText(driver);
		cotsm.ClickAcquistoPrimaRicaricaCheckbox(driver);
	}

	@And("^User enter Taglio$")
	public void user_enter_Taglio() {
		cotsm.SelectTaglioRicaricaDropdown(driver);
	}

	@Then("^Order ID should be generated$")
	public void order_ID_should_be_generated() throws InterruptedException {
		//Thread.sleep(3000);
		 orderID = om.GetOrderId(driver);
		
		System.out.println(orderID);
		Assert.assertTrue(!orderID.isEmpty());
	}
	

	@And("^User click on Documentazione$")
	public void user_click_on_Documentazione() throws InterruptedException  {
		om.ClickDocumentazione(driver);  
	    
	}
	
	@Then("^User verify the order in crm$")
	public void user_verify_the_order_in_crm() throws Throwable {
		getDriver("ie");
		driver.get("http://172.16.191.249/sales_ita/start.swe?");
		cfm.SiebelLogin(driver);
	   cfm.Verifyorder(driver);
	}

	
	@After
	public void Quit()
	{
		driver.quit();
	}
	
	
	
	
	
}
