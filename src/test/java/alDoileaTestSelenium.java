import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.util.Elements;
import javax.swing.plaf.basic.BasicSliderUI;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class alDoileaTestSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/");
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]"));
        element.click();


//        WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("//div[@class='card-body']/h5[text()='Elements']")));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",elements);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",elements);




    }
}
