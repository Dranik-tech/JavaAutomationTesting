import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

abstract public class BasePage {
    public void openPage(String url){
        Selenide.open(url);
    }

    public void fillEnterField(SelenideElement element, String data){
        element.sendKeys(data);
    }

    public void clickOnButton(SelenideElement element){
        element.click();
    }
}
