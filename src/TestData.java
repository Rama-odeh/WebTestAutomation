import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * TestData class handles the setup and teardown of WebDriver, and holds common
 * test data variables.
 */
public class TestData {

	WebDriver driver;
	String url = "http://www.examplewebsite.com";// URL of the web application to be tested
	boolean expectedDisplay = true;// Expected display status for assertions
	int expectedCartItemsCount = 1;// Expected cart items count for assertions

	/**
	 * Set up method to initialize WebDriver and open the web application.
	 */
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();// Initialize Chrome WebDriver
		driver.get(url);// Open the web application
		driver.manage().window().maximize();// Maximize browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Set implicit wait time

	}

	/**
	 * Tear down method to quit WebDriver after tests are completed.
	 */
	@AfterTest
	public void tearDown() {
		// Quit the WebDriver after the tests are completed.
		if (driver != null) {
			driver.quit();
		}
	}

}
