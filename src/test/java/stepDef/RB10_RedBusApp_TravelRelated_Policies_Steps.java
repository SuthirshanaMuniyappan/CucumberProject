package stepDef;

import org.openqa.selenium.By;

import driver.drivers;
import io.cucumber.java.en.Then;

public class RB10_RedBusApp_TravelRelated_Policies_Steps extends drivers{
	@Then("User click on the Travel Related Policies")
	public void user_click_on_the_travel_related_policies() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Travel Related Policies']")).click();
	}
}
