package stepDef;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import driver.drivers;
import io.cucumber.java.en.*;

public class Filters extends drivers {

	@When("User select the filter option \\(A to Z) and take screenshot")
	public void user_select_the_filter_option_a_to_z_and_take_screenshot() throws IOException {
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(filter);
		select.selectByIndex(0);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;             
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);          
		File destinationFile = new File("target/AtoZ.png"); 
		FileUtils.copyFile(srcFile, destinationFile);
	}
	@When("User select the filter option \\(Z to A) and take screenshot")
	public void user_select_the_filter_option_z_to_a_and_take_screenshot() throws IOException {
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(filter);
		select.selectByIndex(1);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;             
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);          
		File destinationFile = new File("target/ZtoA.png"); 
		FileUtils.copyFile(srcFile, destinationFile);	
	}
	@When("User select the filter option price \\(low to high) and take screenshot")
	public void user_select_the_filter_option_price_low_to_high_and_take_screenshot() throws IOException {
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(filter);
		select.selectByIndex(2);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;             
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);          
		File destinationFile = new File("target/LowToHigh.png"); 
		FileUtils.copyFile(srcFile, destinationFile);
	}
	@When("User select the filter option price \\(high to low) and take screenshot")
	public void user_select_the_filter_option_price_high_to_low_and_take_screenshot() throws IOException {
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(filter);
		select.selectByIndex(3);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;             
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);          
		File destinationFile = new File("target/HightoLow.png"); 
		FileUtils.copyFile(srcFile, destinationFile);
	}
	@Then("page logout")
	public void page_logout() {
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
