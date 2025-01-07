package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.allDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends allDrivers{
	
	
	WebDriver driver = new ChromeDriver();
	
	@Before
	private void launchBrowser() {
		driver.get("http://192.168.99.141:3000");
		driver.manage().window().maximize();

	}
	
	@After
	private void quit() {
		driver.quit();
	}

}
