package stepDef;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class paymentPage {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User is in LoginPage")
	public void user_is_in_login_page() throws InterruptedException  {
		driver.get("http://192.168.99.141:3000/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	
	@When("selecting Payment Page")
	public void selecting_payment_page() {
		
		driver.findElement(By.xpath("//a[normalize-space()='Payment Page']")).click();
	}

	@When("user enter the policy amount and calculate and press proceed payment")
	public void user_enter_the_policy_amount_and_calculate_and_press_proceed_payment() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Policy Amount']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Policy Amount']")).sendKeys("200000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Calculate Premium']")).click();
        Thread.sleep(1000);
	}

	@When("press the proceed to pay")
	public void press_the_proceed_to_pay() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Calculate Premium']")).click();
		Thread.sleep(1000);
	}

	@When("It should show the premium amount")
	public void it_should_show_the_premium_amount() {
		String text=driver.findElement(By.xpath("//p[contains(text(), 'Premium:')]")).getText();
		System.out.println(text);
	}

	@Then("User press proceed to pay")
	public void user_press_proceed_to_pay() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Proceed to Pay']")).click();
		Thread.sleep(4000);		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert handled and Payment Done");
	}
}



