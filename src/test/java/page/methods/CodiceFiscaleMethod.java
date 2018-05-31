package page.methods;

import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Env;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import page.objects.CodiceFiscalePage;
import stepdefinitions.DPRicercaClienteSteps;
import util.Utility;

public class CodiceFiscaleMethod extends Utility{
	StringBuffer fn;
	StringBuffer ln;
	int date, month,year;
	String Fiscal;	
	private CodiceFiscalePage cfp = new CodiceFiscalePage();
	
	private String barcodePath;
	private String cfPath;
	private String crmpath;
	
	public CodiceFiscaleMethod()
	{			
		this.barcodePath  = System.getProperty("user.dir")+"\\ScreenImages\\Barcode\\";
		this.cfPath  = System.getProperty("user.dir")+"\\ScreenImages\\CFActivation\\" ;
		this.crmpath = System.getProperty("user.dir")+"\\ScreenImages\\CRMConsumerCreation\\" ;
	}
	
	public void GenerateCodiceDetail()
	{
		String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//First Name
		 fn = new StringBuffer();
		Random rand = new Random();
		for(int i = 0;i<5;i++)
		{
			fn.append(list.charAt(rand.nextInt(list.length())));
		}
		
		//Last Name
		ln = new StringBuffer();
		for(int i = 0;i<5;i++)
		{
			ln.append(list.charAt(rand.nextInt(list.length())));
		}
		
		month = rand.nextInt(12) + 1;
		System.out.println(month);
		year = rand.nextInt(2017-1950) + 1950;
		System.out.println(year);
		if(month==2 && (year % 4 == 0 || year % 400 == 0) && year % 100 != 0 )
		{
			date = rand.nextInt(29)+ 1;
			System.out.println(date);
		}
		else if(month==2)
		{
			date = rand.nextInt(28)+ 1;
			System.out.println(date);
		}
		else if(month==1 || month == 3|| month==5||month==7||month ==8||month==10||month==12)
		{
			date = rand.nextInt(31)+ 1;
			System.out.println(date);
		}
		else
		{
			date = rand.nextInt(30)+ 1;
			System.out.println(date);
		}
		
	}
	
	public String GenerateCodiceFiscale(WebDriver driver) throws IOException, InterruptedException
	{
		cfp.LastNameField(driver).sendKeys(fn);
		cfp.FirstNameField(driver).sendKeys(ln);
		cfp.PlaceOfBirth(driver).sendKeys("Napoli");
		cfp.DateOfBirth(driver).sendKeys(date+"/"+month+"/"+year);
		Select select = new Select(cfp.GenderDropdown(driver));
		select.selectByVisibleText("F");
		cfp.GenerateButton(driver).click();
		Thread.sleep(3000);
		cfp.CopyButton(driver).click();
		Fiscal = cfp.GeneratedCFField(driver).getAttribute("value");
		SetProperty(Fiscal);
		return Fiscal;		
		
	}
	
	public void ActivateCodiceFiscale(WebDriver driver) throws FindFailed, InterruptedException, IOException
	{
		
		CFDetail(driver);
		ClickActivate();		
		
	}
	
	/*public void ActivateCodiceFiscale_SOHOLP(WebDriver driver) throws FindFailed, InterruptedException
	{
		
		CFDetail(driver);
		PartIVA_Activation(driver);
		ClickActivate();		
		
	}
	
	public void PartIVA_Activation(WebDriver driver)
	{
		
	}*/
	
	public void ClickActivate() throws FindFailed, InterruptedException
	{
		WaitAndClick(cfPath+"attiva.png");
	}
	
	public void CFDetail(WebDriver driver) throws InterruptedException, FindFailed, IOException
	{
		
		SiebelLogin(driver);
		Thread.sleep(5000);	
		
		WaitAndClick(cfPath+"cliente.png");
		WaitAndClick(cfPath+"nuovo.png");		
		WaitAndType(cfPath+"ditta.png", fn.toString());			
		WaitAndType(cfPath+"nome.png", ln.toString());
		WaitAndType(cfPath+"codiceFiscale.png", GetProperty("CodiceFiscale"));
		WaitAndType(cfPath+"sesso.png", "F");
		WaitAndType(cfPath+"paese.png", "ITALIA");
		WaitAndType(cfPath+"provincia.png", "NA");
		WaitAndType(cfPath+"luogo.png", "NAPOLI");
		WaitAndType(cfPath+"dateOfBirth.png",date+"/"+month+"/"+year );
		
		WaitAndType(cfPath+"tipoDiDocumento.png", "Passaporto");
		WaitAndType(cfPath+"numeroDocumento.png", "1");
		WaitAndType(cfPath+"EDate.png", "03/02/2028");
		WaitAndType(cfPath+"enteRilascio.png", "Commune");
		WaitAndType(cfPath+"SDate.png", "03/02/2018");
		WaitAndType(cfPath+"localitaDiRilascio.png", "Napoli");
		
		
		WaitAndClick(cfPath+"nomestradaIcon.png");
		Thread.sleep(9000);
		WaitAndClick(cfPath+"nuovo2.png");
		WaitAndClick(cfPath+"tipoDiIndirizzo.png");
        WaitAndClick(cfPath+"tipo_dropdown.png");
        WaitAndClick(cfPath+"piazza.png");

		//WaitAndType(cfPath+"tipoDiIndirizzo.png", "Piazza");		
		//WaitAndClick(cfPath+"nomestrada.png");
		s.type(Key.TAB);
		WaitAndType(cfPath+"nomestrada.png", "abc");
		s.type(Key.TAB);
		WaitAndType(cfPath+"num.png", "1");
		s.type(Key.TAB);
		WaitAndType(cfPath+"paese2.png", "ITALIA");
		s.type(Key.TAB);
		WaitAndType(cfPath+"provincia2.png", "NA");
		s.type(Key.TAB);
		WaitAndType(cfPath+"citta.png", "NAPOLI");
		s.type(Key.TAB);
		WaitAndType(cfPath+"cap.png", "80121");
		
		WaitAndClick(cfPath+"chiudi.png");
		
		WaitAndClick(cfPath+"datiPersonaliLegge.png");
	}
	
	
	public String RetriveICCID(WebDriver driver) throws FindFailed, InterruptedException
	{
	
		Thread.sleep(5000);
		
		WaitAndClick(barcodePath+"sottoscrizioni.png");
		WaitAndClick(barcodePath+"ricaricaICCID.png");
		WaitAndClick(barcodePath+"cerca.png");
		s.dragDrop(barcodePath+"src_drag.png",barcodePath+"drop.png");
		WaitAndType(barcodePath+"codiceKit.png", "*08");
		WaitAndClick(barcodePath+"stato.png");         
		WaitAndClick(barcodePath+"recieved_dropdown.png");
		WaitAndClick(barcodePath+"received.png");    

		//WaitAndType(barcodePath+"stato.png", "Received");
		WaitAndClick(barcodePath+"vai.png");
		s.dragDrop(barcodePath+"src2_drag.png",barcodePath+"drop2.png");
		WaitAndClick(barcodePath+"codiceICCID.png");
		s.doubleClick(barcodePath+"codiceICCID.png");
		
		 s.type("c",Key.CTRL);
		
		 String cICCID= Env.getClipboard().toString();		
		 
		String barcode = cICCID.substring(2);
		return barcode;
	}
	
	public void Verifyorder(WebDriver driver) throws FindFailed, InterruptedException, IOException
	{
		WaitAndClick(crmpath+"Cliente.png");
		WaitAndClick(crmpath+"Cerca.png");
		WaitAndType(crmpath+"CodiceFiscale.png", GetProperty("CodiceFiscale"));
		WaitAndClick(crmpath+"Cerca.png");
		//s.type(Key.TAB+Key.TAB+GetProperty("CodiceFiscale")+Key.ENTER);
		WaitAndClick(crmpath+"CognomeDitta.png");
		WaitAndClick(crmpath+"ordinicliente.png");
		WaitAndClick(crmpath+"Cerca.png");
		s.type(DPRicercaClienteSteps.orderID+Key.ENTER);
		
		if(findImage(cfPath, "Inseritoincoda.png")) {
			System.out.println("THE END....!!!!!");
		}
	}

}
