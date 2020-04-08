package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/**
 * Created by Pradip
 */
//register page class extends utility class to use utilities property
public class RegisterPage extends Utility {
    //below locators for element
    By registerText = By.xpath("//h2[@class='h2 jumbo-title']");
    //below return type method to compare expected and actual result
    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

}

