package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;


import java.util.concurrent.TimeUnit;

/**
 * Created by Pradip
 */
//test base class extends base page class
public class TestBase extends BasePage {

    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();

    //baseUrl variable define Url of application
    String baseUrl = "https://www.barclays.co.uk/";

    //before method comes from TestNG to do action before method
    @BeforeMethod
    //below code to open chrome browser
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    //after class comes from TestNG to do action after class
    @AfterMethod
    //below code closed browsers
    public void tearDown() {
        driver.quit();
    }
}