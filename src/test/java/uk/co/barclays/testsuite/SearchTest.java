package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.SearchPage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Pradip
 */
//search test class extends with test base class
public class SearchTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();


    @Test
    public void verifyUserShouldNavigateToSearchFeature() {
        //below methods calling from pages package
        homePage.clickOnSearchButton();

        //compare expected with actual result
        String expectedResult = "Search";
        String actualResult = searchPage.getWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
