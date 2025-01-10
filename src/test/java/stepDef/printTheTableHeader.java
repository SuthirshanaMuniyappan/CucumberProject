package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class printTheTableHeader {
	
	WebDriver driver = new ChromeDriver();
	
	@When("User login {string} and {string}")
	public void user_login_and(String username, String password) {
		driver.get("http://192.168.99.141:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("Clicks the login button")
	public void clicks_the_login_button() throws Exception {

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		Thread.sleep(5000);
//		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", login_btn);
//		actions.click(login_btn).build().perform();
//		login_btn.click();
	    
	}

	@Then("The User should be redirected to the dashboard page and print the Table header")
	public void the_user_should_be_redirected_to_the_dashboard_page_and_print_the_table_header() throws InterruptedException  {
		
		WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers)
		{
			String text = header.getText();
			System.out.println("Headers: "+text);
		}
 
//		Thread.sleep(5000);
//		Actions actions = new Actions(driver);
//		WebElement logout_btn = driver.findElement(By.xpath("//button[text()='Logout']"));
//		//		actions.moveToElement(logout_btn).click().build().perform();
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout_btn);
//		Thread.sleep(1000); 
    }

	@Then("quit the Browser")
	public void quit_the_browser() {
//	   driver.quit();
	}

		
	

//	@Then("The user should print the table header values to the console")
//	public void the_user_should_print_the_table_header_values_to_the_console() {
//		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table/thead/tr/th"));
//
//        System.out.println("Table Header Values:");
//        for (WebElement header : tableHeaders) {
//            System.out.println(header.getText());
//        }
    }

	   
		
	





