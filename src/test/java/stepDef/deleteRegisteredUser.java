package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class deleteRegisteredUser {
	
	WebDriver driver = new ChromeDriver();
	
	@Then("Quit the NewInsurance Browser")
	public void quit_the_new_insurance_browser() {
		driver.quit();
	}

}
