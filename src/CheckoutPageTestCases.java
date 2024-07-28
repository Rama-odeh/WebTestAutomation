import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * CheckoutPageTestCases class contains test cases for verifying the checkout
 * page functionalities.
 */
public class CheckoutPageTestCases extends TestData {

	WebDriver driver;

	// Constructor to initialize WebDriver
	public CheckoutPageTestCases(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Test Case 4: Verify that the user can proceed to checkout from the cart. This
	 * test clicks the cart button, then the checkout button, and verifies that the
	 * URL contains "checkout".
	 */
	public void verifyProceedToCheckoutTest() {
		// Find and click the cart button.
		WebElement cartButton = driver.findElement(By.className("classname"));
		cartButton.click();
		// Find and click the checkout button.
		WebElement checkoutButton = driver.findElement(By.id("checkoutid"));
		checkoutButton.click();
		// Get the current URL.
		String curentUrlAfterCheckoutButton = driver.getCurrentUrl();
		// Assert that the current URL contains "checkout".
		Assert.assertEquals(curentUrlAfterCheckoutButton.contains("checkout"), true,
				"Did not navigate to checkout page.");

	}

}
