package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driver.drivers;
import io.cucumber.java.en.Then;

public class printTableHeaderSwagLabs extends drivers {
	
	@Then("Print Header Swag Labs")
	public void print_header_swag_labs() {
		
		WebElement header = driver.findElement(By.xpath("//div[normalize-space()='Swag Labs']"));
		String text = header.getText();
		System.out.println(text);
	}



}
