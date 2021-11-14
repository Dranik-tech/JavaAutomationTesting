import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        String greatingText = inputData.nextLine();

        System.out.println("Hello, " + greatingText);
    }
}
