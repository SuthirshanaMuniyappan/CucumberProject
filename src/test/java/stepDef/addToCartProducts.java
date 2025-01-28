package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import driver.drivers;
import io.cucumber.java.en.Then;

public class addToCartProducts extends drivers {
	
	@Then("Add to Cart products")
	public void add_to_cart_products() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		String Saucelabs = driver.findElement(By.xpath(("//div[text()='Sauce Labs Backpack']"))).getText();
		System.out.println(Saucelabs);
		Assert.assertEquals(Saucelabs, "Sauce Labs Backpack");
	
	    
	}


}
