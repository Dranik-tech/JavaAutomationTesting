import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Login page for the handle app.
 */

public class LoginPage extends BasePage {
    public final SelenideElement loginField = $x("//input[@id='user-text-field']");
    public final SelenideElement passwordField = $x("//input[@id='password-text-field']");
    public final SelenideElement signInButton = $x("//div[contains(text(),'Sign In')]");

    public LoginPage(String url){
        this.openPage(url);
    }

    public MainPage openMainPage(SelenideElement element){
        clickOnButton(element);

        return new MainPage();
    }
}
