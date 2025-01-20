package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	 String browserName="CHROME";
	
	public static WebDriver launchBrowser(String browserName) {
		        switch (browserName.toUpperCase()) {
		            case "CHROME":
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		                break;
		                
		            case "FIREFOX":
		                WebDriverManager.firefoxdriver().setup();
		                driver = new FirefoxDriver();
		                break;
		                
		            case "EDGE":
		                WebDriverManager.edgedriver().setup();
		                driver = new EdgeDriver();
		                break;
		                
		            default:
		                throw new IllegalArgumentException("Browser not supported: " + browserName);
		        }
		        driver.manage().window().maximize();  
		        return driver;
		    }

		   
}
