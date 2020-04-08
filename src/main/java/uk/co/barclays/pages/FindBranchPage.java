package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/**
 * Created by Pradip
 */
//find branch page class extends utility class to use utilities property
public class FindBranchPage extends Utility {

    //locators for each element
    By branchFinderText = By.id("page-title");

    //below return type method to compare expected and actual result
    public String getBranchFinderText() {
        return getTextFromElement(branchFinderText);
    }
}
