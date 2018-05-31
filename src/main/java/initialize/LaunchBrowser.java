package initialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import page.methods.CodiceFiscaleMethod;
import page.methods.CodicePromozionaleMethod;
import page.methods.ConfigurazioneOpzioniTariffarieServiziMethod;
import page.methods.ConfigurazioneOrdinediVenditaMethod;
import page.methods.DatiClienteMethods;
import page.methods.LoginPageMethod;
import page.methods.OrderMethod;
import page.methods.RicercaClienteMethod;
import util.Utility;


public class LaunchBrowser {

	protected static WebDriver driver;
	protected CodiceFiscaleMethod cfm;
	protected RicercaClienteMethod rcm; 
	protected DatiClienteMethods dcm;
	protected ConfigurazioneOrdinediVenditaMethod covm;
	protected ConfigurazioneOpzioniTariffarieServiziMethod cotsm ;
	protected OrderMethod om;
	protected LoginPageMethod lpm ;
	protected CodicePromozionaleMethod cpm ;
	protected Properties prop;
	protected File inputFile;
	protected Utility ut;
	
	public WebDriver setDriver(String browser) throws IOException
	{
		
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		prop = new Properties();
		inputFile = new File("Input\\inputParameters.properties");
		InputStream is  = new FileInputStream( inputFile );
		prop.load(is);	
	
	return driver;
	
	}
	
	
	public WebDriver getDriver(String browser) throws IOException
	{
	
	if(driver==null)
	{
		try{
			driver= setDriver(browser);
			
		}catch(MalformedURLException e )
		{
			e.printStackTrace();
		}
	}
	return driver;
	
	}	
	
	public void Initialize()
	{
		cfm = new CodiceFiscaleMethod();
		rcm = new RicercaClienteMethod();
		dcm = new DatiClienteMethods();
		covm = new ConfigurazioneOrdinediVenditaMethod();
		cotsm = new ConfigurazioneOpzioniTariffarieServiziMethod();
		om = new OrderMethod();
		lpm = new LoginPageMethod();
		cpm = new CodicePromozionaleMethod();
		ut= new Utility();	
	}
}
