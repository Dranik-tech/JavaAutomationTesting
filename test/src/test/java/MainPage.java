import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage{
    public final SelenideElement logoutButton = $x("//div[@title='Logout']");
}
