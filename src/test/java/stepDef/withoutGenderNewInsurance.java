package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class withoutGenderNewInsurance {
	
	WebDriver driver= new ChromeDriver();

	@When("User filled all the fields without Gender")
	public void user_filled_all_the_fields_without_gender() {
		driver.findElement(By.id("Name")).sendKeys("Expleo");
		driver.findElement(By.id("email")).sendKeys("expleo@expleo.com");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("31-01-2025");
		//driver.findElement(By.xpath("//input[@value='Female']")).click();
		WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select select = new Select(policyType);
		select.selectByIndex(2);
		WebElement coverage = driver.findElement(By.xpath("//select[@name='coverage']"));
		Select select1 = new Select(coverage);
		select1.selectByIndex(3);

		WebElement selectSumAssured = driver.findElement(By.name("SumInsured"));
		Select select11 = new Select(selectSumAssured);
		select11.selectByIndex(3);
		driver.findElement(By.id("Premium")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@value='No']")).click(); 
	}
	

	@Then("It should show the error msg Gender is Required")
	public void it_should_show_the_error_msg_gender_is_required() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Name is required']"))).getText();
		System.out.println(text);
	}




}
