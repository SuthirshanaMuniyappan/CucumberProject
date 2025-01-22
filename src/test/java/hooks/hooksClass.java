package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.allDrivers;
import driver.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksClass extends drivers {
	
	@Before
	public void launch() {
		driver = new ChromeDriver();
		driver.get("http://192.168.99.141:3000/");
		driver.manage().window().maximize();
	}
	
	@After
	public void quit() {
		driver.quit();

	}

}
