package utilities;
import org.openqa.selenium.WebDriver;
import java.sql.DriverAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class Driver {

	public static WebDriver driver;
public static WebDriver getDriver() {
	String browser=System.getProperty("browser");
	
	
	if (driver == null) {
		browser=PropertiseReader.getProperty("browser");
		switch ("browser") {
		case "chrome":
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\New folder selunume\\chromedriver_win32 (1)\\chromedriver.exe"); 
			ChromeDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\New folder firefox\\geckod\\geckodriver.exe");
			FirefoxDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		
			break;
			
		case "edge" :
			EdgeDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
	
			
			
		  default:
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\New folder selunume\\chromedriver_win32 (1)\\chromedriver.exe");  
			  ChromeDriverManager.chromedriver().setup();
	             driver = new ChromeDriver();
	             driver = new ChromeDriver();
			
			
			driver = new ChromeDriver();
			break;
	}
	
	}
	return driver;
}

public static void quitDriver() {
if (driver != null) {
	driver.quit();
	driver = null;
	}
  }

	
	

}
