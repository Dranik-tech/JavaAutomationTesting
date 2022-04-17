import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class BasePage {
    public void openPage(String url){
        Selenide.open(url);
    }

    public void fillEnterField(SelenideElement element, String data){
        element.sendKeys(data);
    }

    public BasePage clickOnButton(SelenideElement element){
        element.click();

        return new BasePage();
    }
}
