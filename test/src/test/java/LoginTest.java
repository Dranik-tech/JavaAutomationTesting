import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {
    public final static String BASE_URL = "https://handlecrm.com/";
    public final static String LOGIN = "vovair@gmail.com";
    private final static String PASSWORD = "Vladimir123!";

    @Test
    public void loginPositiveAttempt() throws InterruptedException {
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.fillEnterField(loginPage.loginField,LOGIN);
        loginPage.fillEnterField(loginPage.passwordField,PASSWORD);

        MainPage mainPage = loginPage.openMainPage(loginPage.signInButton);

        mainPage.logoutButton.shouldBe(Condition.visible,Duration.ofSeconds(30));

        boolean isLogoutButtonAppeared = mainPage.logoutButton.is(Condition.visible);

        Assert.assertTrue(isLogoutButtonAppeared);
    }
}
