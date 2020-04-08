package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/**
 * Created by Pradip
 */
//search page class extends utility class to use utilities property
public class SearchPage extends Utility {
    //below locators for element
    By welcomeText = By.xpath("//button[@class='btn-search btn btn-primary btn-sm']");

    //below return type method to compare expected and actual result
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
