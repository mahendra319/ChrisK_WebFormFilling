package chrisk.web.form.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	WebDriver driver;
	Properties prop;
	
	
	public String palyrightBeWH = null;
	public String windowHandleEJI = null;
	public String windowHandleSENA =null;
	public String windowHandleGDA = null;
	public String windowHandleSAMI = null;
	public String windowHandlePPL = null;
	
	public WebDriver initialize_WebDriver() {
		
		
		
		//String browserName = "chrome";
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().deleteAllCookies();
		
		driver.get("https://playright.be/");
		palyrightBeWH = driver.getWindowHandle();
		System.out.println("Playright Be windowhandle: "+palyrightBeWH);
		
		WebDriver tabEJI = driver.switchTo().newWindow(WindowType.TAB);
		tabEJI.get("https://eji.hu/adatlapok/szemelyi_adatlap/en");
		windowHandleEJI = tabEJI.getWindowHandle();
		System.out.println("EJI windowhandle: "+windowHandleEJI);
		
		WebDriver tabSENA = driver.switchTo().newWindow(WindowType.TAB);
		tabSENA.get("https://secure.sena.nl/mysena");
		windowHandleSENA = tabSENA.getWindowHandle();
		System.out.println("SENA windowhandle: "+windowHandleSENA);
		
		WebDriver tabGDA= driver.switchTo().newWindow(WindowType.TAB);
		tabGDA.get("https://portal.gda.pt/");
		windowHandleGDA = tabGDA.getWindowHandle();
		System.out.println("GDA windowhandle: "+windowHandleGDA);
		
		
		WebDriver tabSAMI = driver.switchTo().newWindow(WindowType.TAB);
		tabSAMI.get("https://minasidor.sami.se/recordinglists/new");
		windowHandleSAMI = tabSAMI.getWindowHandle();
		System.out.println("SAMI windowhandle: "+windowHandleSAMI);
		
		
		
		WebDriver tabPPL = driver.switchTo().newWindow(WindowType.TAB);
		tabPPL.get("https://myppl.ppluk.com/s/login/?ec=302&startURL=%2Fs%2F");
		windowHandlePPL = tabPPL.getWindowHandle();
		System.out.println("PPL windowhandle: "+windowHandlePPL);
		
	
		return driver;
	}
	
	
	public Properties prop_init() {
		
		prop = new Properties();
		
		String path = "./src/main/java/chrisk/web/form/data/data.properties";
		
		try {
			FileInputStream ip = new FileInputStream(path);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
}
