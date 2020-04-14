package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.barclays.pages.FindBranchPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Pradip
 */
//find branch test class extends test base class
public class FindBranchTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    FindBranchPage findBranchPage = new FindBranchPage();


    @Test(groups = {"Regression"})
    public void verifyUserShouldNavigateToFindABranchFeature() {
        //below methods calling from pages package
        homePage.clickOnFindBranchButton();

        //compare expected with actual result
        String expectedResult = "Branch Finder";
        String actualResult = findBranchPage.getBranchFinderText();
        Assert.assertEquals(expectedResult, actualResult);


    }

}
