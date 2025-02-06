package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.allDrivers;
import driver.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends drivers {

	@Before
	public void launch(Scenario scenario) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.99.141:3000/");
		
		
//		if (scenario.getSourceTagNames().contains("@Sauce_Demo")) {
//			driver.get("https://www.saucedemo.com");
//		} else {
//			driver.get("http://192.168.99.141:3000/");
//		}
	}

	@After
	public void quit() {
		if (driver != null) {
			driver.quit();
		}

	}

}
