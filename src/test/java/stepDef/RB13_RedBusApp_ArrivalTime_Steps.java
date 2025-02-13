package stepDef;

import org.openqa.selenium.By;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB13_RedBusApp_ArrivalTime_Steps extends drivers{
	@Then("User click on the ArrivalTime")
	public void user_click_on_the_arrival_time() {
	   driver.findElement(By.xpath("//div[text()='ARRIVAL TIME']")).click();
	   System.out.println("User is on the Arrival time Successfully");
	}

}
