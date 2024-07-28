import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * MainPageTestCases class contains test cases for verifying the main page
 * functionalities.
 */
public class MainPageTestCases extends TestData {

	WebDriver driver;

	// Constructor to initialize WebDriver
	public MainPageTestCases(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Test Case 1: Verify that the list of books is displayed correctly. This test
	 * checks if the book list element contains any books (li elements).
	 */
	public void verifyBookListIsDisplayedTest() {
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
	 * Test Case 2: Verify that a user can add a book to the cart. This test clicks
	 * the "Add to Cart" button for a specific book and checks the cart item count.
	 */
	public void verifyAddBookToCartTest() {
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
		Assert.assertEquals(actualCartItemsCountAsInt, expectedCartItemsCount,
				"Cart item count did not update correctly.");
	}

	/**
	 * Test Case 3: Verify that the cart updates correctly when a book is added.
	 * This test clicks the "Add to Cart" button for another book and checks if the
	 * cart item count increases.
	 */
	public void verifyCartUpdatesCorrectlyTest() {
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
		Assert.assertEquals(updateCartItemsCountAsInt > expectedCartItemsCount, true,
				"Cart did not update correctly after adding another book.");

	}

}
