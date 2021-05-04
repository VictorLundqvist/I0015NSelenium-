import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adlibirs {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://Adlibris.Com/se/");
        driver.manage().window().setSize(new Dimension(1900, 1050));

        WebElement element = driver.findElement(By.id("q"));
        element.sendKeys("praktisk mjukvarutestning");
        element.submit();

        WebElement element2 = driver.findElement(By.className("search-result__product__name"));
        element2.click();

        WebElement element3 = driver.findElement(By.className("product__add-to-cart"));
        element3.click();
        Thread.sleep(1000);
        WebElement checkout = driver.findElement(By.className("notifications-bar__added-to-cart__to-checkout"));
        checkout.click();


    }
}
