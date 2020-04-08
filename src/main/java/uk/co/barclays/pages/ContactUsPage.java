package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/**
 * Created by Pradip
 */
//contact us page class extends utility class to use utilities property
public class ContactUsPage extends Utility {
    //locators for element
    By contactUsText = By.xpath("//h1[contains(text(),'Contact us')]");

    //below return type method to compare expected and actual result
    public String getContactUsText() {
        return getTextFromElement(contactUsText);
    }


}
