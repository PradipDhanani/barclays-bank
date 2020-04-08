package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.RegisterPage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Pradip
 */
//register test class extends with test base class
public class RegisterTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


    @Test
    public void verifyUserShouldNavigateToRegisterFeature() {
        //below methods calling from pages package
        homePage.clickOnRegisterButton();
        //compare expected with actual result
        String expectedResult = "Register for Online Banking";
        String actualResult = registerPage.getRegisterText();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
