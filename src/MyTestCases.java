import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * MyTestCases class contains the main test methods that call the specific test
 * cases from MainPageTestCases and CheckoutPageTestCases classes.
 */
public class MyTestCases extends TestData {

	MainPageTestCases mainPage;
	CheckoutPageTestCases checkoutPage;

	/**
	 * Override the setUp method to initialize the specific test cases.
	 */
	@Override
	@BeforeTest
	public void setUp() {
		super.setUp(); // Call the setUp method from TestData class
		mainPage = new MainPageTestCases(driver); // Initialize MainPageTestCases with the WebDriver
		checkoutPage = new CheckoutPageTestCases(driver); // Initialize CheckoutPageTestCases with the WebDriver
	}

	/**
	 * Test method to verify that the list of books is displayed correctly. This
	 * method calls verifyBookListIsDisplayedTest from MainPageTestCases.
	 */
	@Test(description = "MainPageTestCases : Verify that the list of books is displayed correctly", priority = 1)
	public void verifyBookListIsDisplayed() {

		mainPage.verifyBookListIsDisplayedTest(); // Call the test method from MainPageTestCases

	}

	/**
	 * Test method to verify that a user can add a book to the cart. This method
	 * calls verifyAddBookToCartTest from MainPageTestCases.
	 */
	@Test(description = "MainPageTestCases : Verify that a user can add a book to the cart", priority = 2)
	public void verifyAddBookToCart() {

		mainPage.verifyAddBookToCartTest(); // Call the test method from MainPageTestCases
	}

	/**
	 * Test method to verify that the cart updates correctly when a book is added.
	 * This method calls verifyCartUpdatesCorrectlyTest from MainPageTestCases.
	 */
	@Test(description = "MainPageTestCases : Verify that the cart updates correctly when a book is added", priority = 3)
	public void verifyCartUpdatesCorrectly() {

		mainPage.verifyCartUpdatesCorrectlyTest(); // Call the test method from MainPageTestCases

	}

	/**
	 * Test method to verify that the user can proceed to checkout from the cart.
	 * This method calls verifyProceedToCheckoutTest from CheckoutPageTestCases.
	 */
	@Test(description = "CheckoutPageTestCases : Verify that the user can proceed to checkout from the cart", priority = 4)
	public void verifyProceedToCheckout() {
		checkoutPage.verifyProceedToCheckoutTest(); // Call the test method from CheckoutPageTestCases

	}

}
