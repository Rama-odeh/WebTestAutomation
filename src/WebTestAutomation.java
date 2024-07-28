import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTestAutomation {

	WebDriver driver;
	String url = "http://www.examplewebsite.com";
	boolean expectedDisplay = true;
	int expectedCartItemsCount = 1;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	/**
     * Test Case 1: Verify that the list of books is displayed correctly.
     * This test checks if the book list element contains any books (li elements).
     */
	@Test(priority = 1)
	public void verifyBookListIsDisplayed() {
		// Find the book list element using CSS selector.
		WebElement bookList = driver.findElement(By.cssSelector(".class.name"));
		// Find all book items (li elements) within the book list.
		List<WebElement> books = bookList.findElements(By.tagName("li"));
		// Get the number of book items.
		int actualDisplayAsbooksSize = books.size();
		// Assert that the book list is not empty.
		Assert.assertEquals(actualDisplayAsbooksSize > 0, expectedDisplay, "Book list is not displayed correctly.");

	}
	/**
     * Test Case 2: Verify that a user can add a book to the cart.
     * This test clicks the "Add to Cart" button for a specific book and checks the cart item count.
     */
	@Test(priority = 2)
	public void verifyAddBookToCart() {
		// Find and click the "Add to Cart" button for the book with ID "AddBookId1".
		WebElement addToCartButton = driver.findElement(By.id("AddBookId1"));
		addToCartButton.click();
		// Find the cart item count element.
		WebElement cartItemsCount = driver.findElement(By.xpath("//TAGNAME[@attributeName='value of attribute']"));
		// Get the text of the cart item count element.
		String cartItemsCountAsText = cartItemsCount.getText();
		// Convert the text to an integer.
		int actualCartItemsCountAsInt = Integer.parseInt(cartItemsCountAsText);
		// Assert that the cart item count matches the expected count.
		Assert.assertEquals(actualCartItemsCountAsInt, expectedCartItemsCount, "Cart item count did not update correctly.");
	}
	/**
     * Test Case 3: Verify that the cart updates correctly when a book is added.
     * This test clicks the "Add to Cart" button for another book and checks if the cart item count increases.
     */
	@Test(priority = 3)
	public void verifyCartUpdatesCorrectly() {
		// Find and click the "Add to Cart" button for the book with ID "AddBookId2".
		WebElement addToCartButton = driver.findElement(By.id("AddBookId2"));
		addToCartButton.click();
		// Find the cart item count element.
		WebElement cartItemsCount = driver.findElement(By.xpath("//TAGNAME[@attributeName='value of attribute']"));
		// Get the text of the cart item count element.
		String updateCartItemsCountAsText = cartItemsCount.getText();
		// Convert the text to an integer.
		int updateCartItemsCountAsInt = Integer.parseInt(updateCartItemsCountAsText);
		// Assert that the cart item count has increased.
		Assert.assertEquals(updateCartItemsCountAsInt > expectedCartItemsCount, true,"Cart did not update correctly after adding another book.");

	}
	/**
     * Test Case 4: Verify that the user can proceed to checkout from the cart.
     * This test clicks the cart button, then the checkout button, and verifies that the URL contains "checkout".
     */
	@Test(priority = 4)
	public void verifyProceedToCheckout() {
		 // Find and click the cart button.
		WebElement cartButton = driver.findElement(By.className("classname"));
		cartButton.click();
		// Find and click the checkout button.
		WebElement checkoutButton = driver.findElement(By.id("checkoutid"));
		checkoutButton.click();
		// Get the current URL.
		String curentUrlAfterCheckoutButton = driver.getCurrentUrl();
		// Assert that the current URL contains "checkout".
		Assert.assertEquals(curentUrlAfterCheckoutButton.contains("checkout"), true, "Did not navigate to checkout page.");

	}

	@AfterTest
	public void tearDown() {
		// Quit the WebDriver after the tests are completed.
		if (driver != null) {
			driver.quit();
		}
	}

}
