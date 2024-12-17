package base;

import config.ConfigManager;
import config.DriverFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {



    // WebDriver instance to be shared across test methods
    protected   WebDriver driver;

    // Logger instance to log test actions and important events
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    /**
     * This method runs before each test method. It initializes the WebDriver, opens the browser,
     * and navigates to the base URL from the configuration.
     */
//    @BeforeClass(groups = {"a","b"})
//    @BeforeMethod(groups = {"a","b"})
    @BeforeMethod
    public  void setup( ) {
        // Initialize WebDriver using the DriverFactory
        driver = DriverFactory.getDriver();
        // Navigate to the base URL as configured in the properties file
        driver.get(ConfigManager.getProperty("baseUrl"));
        // Log that the test has started with the base URL
        logger.info("Started test with URL {}", ConfigManager.getProperty("baseUrl"));

    }


    /**
     * This method runs after each test method. It quits the WebDriver and closes the browser.
     */
//
//    @AfterClass(groups = {"a","b"})
//    @AfterMethod(groups = {"a","b"})
    @AfterMethod
    public void tearDown() {
//         Quit the WebDriver and close the browser window
            DriverFactory.quitDriver();
            logger.info("Driver instance is quit after the test");


    }

}