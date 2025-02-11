package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.drivers;
import io.cucumber.java.en.*;

public class RB09_RedBusApp_CancellationPolicy_Steps extends drivers {

	@Then("User click on the Cancellation Policy")
	public void user_click_on_the_cancellation_policy() {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Cancellation Policy']"))).click();
		   driver.findElement(By.xpath("//div[text()='Cancellation Time']")).click();
		   System.out.println("User clicked on the Cancellation Time Successfully");
		   driver.findElement(By.xpath("//div[text()='Cancellation Charges']")).click();
		   System.out.println("User clicked on the Cancellation Charges Successfully");
	}
	}
		
