package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import driver.drivers;
import io.cucumber.java.en.Then;

public class checkout extends drivers {
	
	@Then("User click the Check out button")
	public void user_click_the_check_out_button() {
		driver.findElement(By.name("checkout")).click();   
	}

	@Then("User fills the information firstname and lastname and postalcode")
	public void user_fills_the_information_firstname_and_lastname_and_postalcode() {		
		driver.findElement(By.id("first-name")).sendKeys("suthir");
		driver.findElement(By.id("last-name")).sendKeys("shana");
		driver.findElement(By.name("postalCode")).sendKeys("600096");	   
	}

	@Then("User clicks the continue button")
	public void user_clicks_the_continue_button() {
		driver.findElement(By.id("continue")).click();
	}

	@Then("User navigate to the overview page")
	public void user_navigate_to_the_overview_page() throws InterruptedException {
		String Title = driver.findElement(By.xpath(("//span[@class='title']"))).getText();
		System.out.println(Title);
		Assert.assertEquals(Title, "Checkout: Overview");
		Thread.sleep(3000);
	}

	@Then("user click finish buton")
	public void user_click_finish_buton() throws InterruptedException {
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);	   
	}


}
