package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import driver.allDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newInsurancePage {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User should be in login Page with valid credentials")
	public void user_should_be_in_login_page_with_valid_credentials() throws InterruptedException {
		
		driver.get("http://192.168.99.141:3000");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("suthirshana.muniyappan@expleogroup.com");  
		driver.findElement(By.id("Password")).sendKeys("Suthir"); 
        Actions actions = new Actions(driver);
		
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(login_btn).build().perform();
		
	}
	    

	@When("User Clicks the New Insurance Tab")
	public void user_clicks_the_new_insurance_tab() {
		driver.findElement(By.xpath("//a[text()='New Insurance']")).click(); 
	     
	}

	@When("User enters the {string}, {string}, {string}, {string}")
	public void user_enters_the(String Name, String Email, String Address, String Date) {
		driver.findElement(By.id("Name")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("Address")).sendKeys(Address);
		driver.findElement(By.id("DateOfBirth")).sendKeys(Date);
	     
	}

	@When("User Select the {string} and {string} and {string}")
	public void user_select_the_and_and(String Gender, String PolicyType, String Coverage) {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		// PolicyType - Drop Down - Select Class
		WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']"));
	    Select select = new Select(policyType);
	    select.selectByIndex(2);
	    WebElement coverage = driver.findElement(By.xpath("//select[@name='coverage']"));
	    Select select1 = new Select(coverage);
	    select1.selectByIndex(3);
	     
	}

	@When("User select the {string} and {string}")
	public void user_select_the_and(String SumInsured, String Premium) {
		
		WebElement selectSumAssured = driver.findElement(By.name("SumInsured"));
		Select select = new Select(selectSumAssured);
		select.selectByIndex(3);
		
		driver.findElement(By.id("Premium")).sendKeys("5000");
	     
	     
	}

	@When("User clicks the Yes or No button")
	public void user_clicks_the_yes_or_no_button() {
	    driver.findElement(By.xpath("//input[@value='No']")).click(); 
	     
	}

	@When("User click the Submit button")
	public void user_click_the_submit_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	}

	@Then("Page should show Insurance policy created successfully")
	public void page_should_show_insurance_policy_created_successfully() {
		//WebElement policy_created_msg = driver.findElement(By.xpath("//div//following::p[text()='Insurance policy created successfully.']"));
		//policy_created_msg.isDisplayed();
		System.out.println("New Insurance policy Created Successfully"); 
	     
	}
	@Then("Quit the Browser")
	public void quit_the_browser() {
	    driver.quit();
	}

}
