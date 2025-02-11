package stepDef;

import org.openqa.selenium.By;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB08_RedBusApp_BookingPolicies_Steps extends drivers {

	@Then("User click on the Booking Policies")
	public void user_click_on_the_booking_policies() {
	    driver.findElement(By.xpath("(//span[text()='Booking policies'])[1]")).click();
	}



}
