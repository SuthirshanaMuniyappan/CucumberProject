package stepDef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import io.cucumber.java.en.*;

public class AHP02_Adactin_SearchHotelSteps extends drivers {

	@Given("User should be in Adactin Hotel Home page")
	public void userShouldBeInAdactinHotelHomePage() {
		findElementID("username").sendKeys("TestingSuthir");
		findElementID("password").sendKeys("Test@123");
		findElementXpath("//input[@type='Submit']").click();
		WebElement welcome = findElementXpath("//td[@class='welcome_menu']");
		String text = welcome.getText();
		System.out.println(text);

	}
	@When("User select the Location, Hotels, RoomType, NoOfRooms,")
	public void userSelectTheLocationHotelsRoomTypeNoOfRooms() {
		WebElement location = findElementName("location");
		selectByValue(location, "London");

		WebElement Hotels = findElementName("hotels");
		selectByValue(Hotels, "Hotel Sunshine");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement RoomType = findElementID("room_type");
		selectByIndex(RoomType, 1);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement NoOfRooms = findElementName("room_nos");
		selectByIndex(NoOfRooms, 1);
	}
	@When("User Enters the checkIn and checkOut Date")
	public void userEntersTheCheckInAndCheckOutDate() {
		findElementID("datepick_in").clear();
		findElementID("datepick_in").sendKeys("19/02/2025");
		findElementID("datepick_out").clear();
		findElementID("datepick_out").sendKeys("21/02/2025");
	}
	@Then("User select AdultsPerRoom, ChildrenPerRoom and Clicks the search button")
	public void userSelectAdultsPerRoomChildrenPerRoomAndClicksTheSearchButton() {
		WebElement AdultsPerRoom = findElementID("adult_room");
		selectByValue(AdultsPerRoom, "2");
		WebElement ChildrenPerRoom = findElementID("child_room");
		selectByIndex(ChildrenPerRoom, 0);
		findElementID("Submit").click();
	}
	@Then("It should be redirected to Hotel booking page")
	public void itShouldBeRedirectedToHotelBookingPage() {
		getCurrentUrl();
	}	
	@Then("User select the hotel and continue for the payment")
	public void userSelectTheHotelAndContinueForThePayment() {
		findElementID("radiobutton_0").click();
		findElementID("continue").click();
	}
	@When("User should enter the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void userShouldEnterThe(String FirstName, String LastName, 
			String BillingAddress, String CCNumber, String CCType, String ExpiryMonth, String ExpiryYear, String CVV) {
		
		findElementName("first_name").sendKeys(FirstName);
		findElementXpath("//input[@name='last_name']").sendKeys(LastName);
		findElementXpath("//textarea[@class='txtarea']").sendKeys(BillingAddress);
		findElementName("cc_num").sendKeys(CCNumber);
		findElementName("cc_type").sendKeys(CCType);
		findElementName("cc_exp_month").sendKeys(ExpiryMonth);
		findElementName("cc_exp_year").sendKeys(ExpiryYear);
		findElementID("cc_cvv").sendKeys(CVV);
	}
	@Then("User click the bookNow")
	public void userClickTheBookNow() {
		findElementName("book_now").click();
	}
	@Then("it should show the Order Number")
	public void itShouldShowTheOrderNumber() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement orderNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id, 'order_no')]")));
		@Nullable
		String text = orderNumber.getAttribute("value");
		System.out.println("Order ID: "+text);
	}
}
