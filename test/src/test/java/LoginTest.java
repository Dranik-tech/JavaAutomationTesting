import com.codeborne.selenide.Driver;
import org.junit.Test;

public class LoginTest extends BaseTest {
    public final static String BASE_URL = "https://handlecrm.com/";
    public final static String LOGIN = "vovair@gmail.com";
    private final static String PASSWORD = "Vladimir123!";

    @Test
    public void loginAttempt() throws InterruptedException {
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.fillEnterField(loginPage.loginField,LOGIN);
        loginPage.fillEnterField(loginPage.passwordField,PASSWORD);
        loginPage.clickOnButton(loginPage.signInButton);

        Thread.sleep(50000);
    }
}
