package stepDef;

import org.openqa.selenium.By;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB07_RedBusApp_BookingBusTicket_Modify_Steps extends drivers {

	@Then("User click on the Modify")
	public void user_click_on_the_modify() throws InterruptedException {
	    driver.findElement(By.xpath("//div[text()='Modify']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("dest")).clear();
	    driver.findElement(By.id("dest")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//button[text()='SEARCH']")).click();
	}
}