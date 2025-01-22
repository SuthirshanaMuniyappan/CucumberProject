package stepDef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.drivers;
import io.cucumber.java.en.*;

public class adminPanelManageUsers extends drivers {

	@When("user clicks the Admin panel")
	public void user_clicks_the_admin_panel() throws InterruptedException, AWTException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		WebElement Admin_panel = driver.findElement(By.xpath("//a[normalize-space()='Admin Panel']"));
		Admin_panel.click();
	}

	@When("user clicks manage users to View Users")
	public void user_clicks_manage_users_to_view_users() {
		driver.findElement(By.xpath("//button[text()='View Users']")).click();
	}

	@Then("user delete the button")
	public void user_delete_the_button() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 16000)");
		Thread.sleep(3000);
		WebElement delete_btn = driver.findElement(By.xpath("//td[text()='user4@gmail.com']/following::td[2][@class='deleteButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
		Actions action = new Actions(driver);
		action.click(delete_btn).build().perform();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		WebElement doubleClickYes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Yes']")));
		Actions act1 = new Actions(driver);
		act1.doubleClick(doubleClickYes).build().perform();
		Thread.sleep(2000);
		System.out.println("Users Deleted Successfully");
	}
}
