package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB06_RedBUsApp_BookingBusTicket_HideSeats_Steps extends drivers{

	@Then("User click on the Hide Seats")
	public void user_click_on_the_hide_seats() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='HIDE SEATS']"))).click();
	}
}
