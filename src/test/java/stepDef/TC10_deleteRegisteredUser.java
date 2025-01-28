package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.drivers;
import io.cucumber.java.en.*;

public class TC10_deleteRegisteredUser extends drivers{
	
	WebDriver driver = new ChromeDriver();
	
	@Then("Quit the NewInsurance Browser")
	public void quit_the_new_insurance_browser() {
		driver.quit();
	}

}
