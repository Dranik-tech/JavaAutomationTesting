import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\Java_projects\\JavaAutomationTesting\\test\\drivers\\geckodriver.exe");
//test comment
        WebDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.manage().window().setSize(new Dimension(800,900));

        logIn(driver,"https://handlecrm.com","vovair@gmail.com","Vladimir123!");

        //Assert.assertEquals();

        //driver.quit();
    }

    // method for logged in to any site.
    public static void logIn(WebDriver driver, String url, String login, String password)
    {
        // go to resource
        driver.navigate().to(url);

        //wait while page will be loading
        WebElement elementsLoading = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password-text-field\"]")));

        //find password field and filling it
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password-text-field\"]"));
        passwordField.sendKeys(password);

        //find login field and filling it
        WebElement loginField = driver.findElement(By.xpath("//input[@id='user-text-field']"));
        loginField.sendKeys(login);

        WebElement signInButton = driver.findElement(By.xpath("//button"));
        signInButton.click();
    }
}
