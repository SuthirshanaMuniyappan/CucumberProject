package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class deletePolicy {
	
	WebDriver driver = new ChromeDriver();

	
	@Given("User opens the login page")
	public void user_opens_the_login_page() {
		
		driver.get("http://192.168.99.141:3000");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("User should enters {string} and {string}")
	public void user_should_enters_and(String username, String password) throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);  //"suthirshana.muniyappan@expleogroup.com"
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys(password); //"Suthir"
	}
	
	@When("User clicks the Submit button")
	public void user_clicks_the_submit_button() throws Throwable {
		
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", login_btn);
		actions.click(login_btn).build().perform();
//		login_btn.click();
	}
	
	@Then("User clicks delete Policy")
	public void user_clicks_delete_policy() throws Exception {
		Thread.sleep(3000);
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

	@Then("quit the Browser for {string} scenario")
	public void quit_the_browser_for_scenario(String name) {
	   
		driver.quit();
		System.out.println("***************Browser is closed for "+name+" scenario***************");
	}
	
	//
	
	@Then("User clicks Yes button")
	public void user_clicks_yes_button() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(3000);
		
	}



}
