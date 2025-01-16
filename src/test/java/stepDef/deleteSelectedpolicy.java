package stepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class deleteSelectedpolicy {
	
	WebDriver driver = new ChromeDriver();

	@Given("User should be in Login Page")
	public void user_should_be_in_login_page() throws InterruptedException {
		driver.get("http://192.168.99.141:3000/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.name("username")).sendKeys("suthirshana.muniyappan@expleogroup.com");
//		driver.findElement(By.id("Password")).sendKeys("Suthir");
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		Thread.sleep(2000);
	}

	@When("User Select the account using AccountName for delete")
	public void user_select_the_account_using_account_name_for_delete() throws InterruptedException {
		// Table Header 
				WebElement table = driver.findElement(By.xpath("//div[@class='insuranceTable ml-44']"));
				List<WebElement> headers = table.findElements(By.tagName("th"));
				for (WebElement header : headers) 
				{
					String text = header.getText();
					System.out.println("Headers: "+text); 
				}

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0, 6000)");

				WebElement delete_btn = driver.findElement(By.xpath("//tbody/tr[19]/td[3]/button")); //(//button[text()='Delete Policy'])[1]
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
				Thread.sleep(3000);

				Actions act = new Actions(driver);
				act.doubleClick(delete_btn).build().perform();
				Thread.sleep(3000);
	}

	@When("User clicks the delete button one by one")
	public void user_clicks_the_delete_button_one_by_one() {
	    
	}

	@Then("Account should be deleted")
	public void account_should_be_deleted() {
	    System.out.println("User should be deleted");
	}



}
