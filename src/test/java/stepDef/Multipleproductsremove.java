package stepDef;

import org.openqa.selenium.By;
import driver.drivers;
import io.cucumber.java.en.Then;

public class Multipleproductsremove extends drivers  {
	
	@Then("user add another product to the cart")
	public void user_add_another_product_to_the_cart() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("user removes the product from the cart")
	public void user_removes_the_product_from_the_cart() throws InterruptedException {
		driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
	    
	}

		

}
