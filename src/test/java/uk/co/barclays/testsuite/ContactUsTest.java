package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.barclays.pages.ContactUsPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Pradip
 */
//contact us test class extends with test base class
public class ContactUsTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();


    @Test
    public void verifyUserShouldNavigateToContactUsFeature() {
        //below methods calling from pages package
        homePage.clickOnContactUsButton();
        //compare expected with actual result
        String expectedResult = "Contact us";
        String actualResult = contactUsPage.getContactUsText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
