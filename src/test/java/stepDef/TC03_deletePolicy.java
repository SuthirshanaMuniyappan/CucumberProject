package stepDef;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import driver.drivers;
import io.cucumber.java.en.*;

public class TC03_deletePolicy extends drivers{

	@Then("User clicks delete Policy")
	public void user_clicks_delete_policy() throws Exception {

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		
		WebElement delete_btn = driver.findElement(By.xpath("//tbody/tr[1]/td[8]/button")); //(//button[text()='Delete Policy'])[1]
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
		Thread.sleep(3000);
	}

	@Then("User clicks Cancel button")
	public void user_clicks_cancel_button() throws Exception {	
		Thread.sleep(3000);
		WebElement cancel_btn = driver.findElement(By.xpath("//button[text()='Cancel']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancel_btn);
		Thread.sleep(3000);	
	}
	
	@Then("User clicks Yes button")
	public void user_clicks_yes_button() throws Exception {	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(3000);
	}
}
