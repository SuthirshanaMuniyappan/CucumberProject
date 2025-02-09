package stepDef;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.drivers;
import io.cucumber.java.en.*;

public class RB01_RedBus_SearchBus_Steps extends drivers{

	@Given("I am on the RedBus homepage")
	public void i_am_on_the_red_bus_homepage() {

	}

	@When("I enter {string} in the source city field")
	public void i_enter_in_the_source_city_field(String sourceCity) {

		WebElement sourceField = driver.findElement(By.id("src"));
		sourceField.sendKeys(sourceCity);

	}

	@When("I enter {string} in the destination city field")
	public void i_enter_in_the_destination_city_field(String destinationCity) {
		WebElement destinationField = driver.findElement(By.id("dest"));
		destinationField.sendKeys(destinationCity);

	}

	@When("I select {string} as the date")
	public void i_select_as_the_date(String date) throws AWTException {

		//		 WebElement dateField = driver.findElement(By.id("onward_cal"));
		//	        dateField.sendKeys(date);
		Actions act = new Actions(driver);
		WebElement date1 = driver.findElement(By.xpath("//span[text()='Date']"));
		act.moveToElement(date1).click().build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_MINUS); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//*[text()='"+date+"']")).click();
		System.out.println("Date- 09/02/2024 clicked Successfully");
		//       driver.quit();
	}

	@When("I click on {string}")
	public void i_click_on(String button) {
		WebElement buttonElement = driver.findElement(By.id("search_button"));
		buttonElement.click();
		//driver.findElement(By.id("search_button")).click();
	}

	@Then("I should see a list of buses from Chennai to Palani")
	public void i_should_see_a_list_of_buses_from_chennai_to_palani() throws Throwable {
		
		Thread.sleep(5000);
		List<WebElement> busList = driver.findElements(By.xpath("//div[contains(@class,'travels')]"));

		int i = 1;
		for (WebElement buses : busList) {

			String busName = buses.getText();
			System.out.println(i+".ListOfBuses: "+busName);
			assertTrue(buses.isDisplayed());
			i++;
			
		}


	}		

	@Then("Validate the page title should contain {string}")
	public void Validate_the_page_title_should_contain(String title) {
		
		WebElement search_title =driver.findElement(By.xpath("//h1[text()='Chennai to Palani Bus']"));
		String search_title_text = search_title.getText();
		assertTrue(search_title_text.contains(title));
		System.out.println("Title : "+search_title_text+" is validated successfully");
		
	}
	
	@Then("Validate the error message {string}")
	public void validate_the_error_message(String ex_error_msg) throws Throwable {
	    
		Thread.sleep(5000);
		WebElement oops_error =driver.findElement(By.xpath("//div[@class='msg']"));
		String oops_error_msg = oops_error.getText();
		assertEquals(ex_error_msg, oops_error_msg);
		System.out.println("Error message : "+oops_error_msg+" is validated successfully");
		
	}
	

	



}
