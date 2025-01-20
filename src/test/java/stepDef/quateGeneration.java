package stepDef;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class quateGeneration {
	
	WebDriver driver = new ChromeDriver();
	@Given("user login the page with valid credential")
	public void user_login_the_page_with_valid_credential() {
		driver.get("http://192.168.99.141:3000");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user click the quate generation")
	public void user_click_the_quate_generation() {
		driver.findElement(By.xpath("//a[normalize-space()='Quate Generation']")).click();
	}

	@When("user select the policy type")
	public void user_select_the_policy_type() {
		driver.findElement(By.name("annualIncome")).sendKeys("500000");
		driver.findElement(By.name("existingDebts")).sendKeys("100000");
	}

	@When("user enter the Coverage Amount")
	public void user_enter_the_coverage_amount() {
		driver.findElement(By.name("futureExpenses")).sendKeys("300000");
	}

	@When("user enter Customer Age")
	public void user_enter_customer_age() {
		driver.findElement(By.name("finalExpenses")).sendKeys("200000");
		driver.findElement(By.xpath("//button[normalize-space()='Add Dependent']")).click();
	}

	@When("user click generate quote")
	public void user_click_generate_quote() throws InterruptedException {
		driver.findElement(By.name("dependentName-0")).sendKeys("Suthir");
		driver.findElement(By.name("dependentAge-0")).sendKeys("29");
		driver.findElement(By.xpath("//button[normalize-space()='Generate Quote']")).click();
		Thread.sleep(5000);
	    
	}

	@Then("user print the msgs")
	public void user_print_the_msgs() {
		WebElement generated = driver.findElement(By.xpath("//h3[starts-with(text(), 'Generated Quote')]"));
		String text = generated.getText();
		System.out.println(text);
	}




}
