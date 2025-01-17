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

public class withoutNameNewInsurance {

	WebDriver driver = new ChromeDriver();

	@Given("User should be in login Page for field validating")
	public void user_should_be_in_login_page_for_field_validating() throws InterruptedException {
		driver.get("http://192.168.99.141:3000/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("suthirshana.muniyappan@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Suthir");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);

	}

	@When("User Clicks the NewInsurance Tab")
	public void user_clicks_the_new_insurance_tab() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='New Insurance']")).click();
		Thread.sleep(2000);
	}

	@When("User enters all the Fields Without Name")
	public void user_enters_all_the_fields_without_name() {
		driver.findElement(By.id("Name")).sendKeys(" ");
		driver.findElement(By.id("email")).sendKeys("expleo@expleo.com");
		driver.findElement(By.id("Address")).sendKeys("Expleo");
		driver.findElement(By.id("DateOfBirth")).sendKeys("31-01-2025");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
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
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("User click the Submit button and it should show Error")
	public void user_click_the_submit_button_and_it_should_show_error() throws InterruptedException {
		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='*Name is required']"))).getText();
		System.out.println(text);
		

	}



}
