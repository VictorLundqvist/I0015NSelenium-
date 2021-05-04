import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeFill {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.actitime.com/");
        driver.manage().window().setSize(new Dimension(1900, 1050));

        WebElement element = driver.findElement(By.className("header__button"));
        element.click();

        WebElement firstname = driver.findElement(By.id("first-name"));
        WebElement lastname = driver.findElement(By.id("last-name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement company = driver.findElement(By.id("company"));
        Thread.sleep(1000);
        firstname.sendKeys("Victor");
        lastname.sendKeys("Lundqvist");
        email.sendKeys("victor.test@test.com");
        company.sendKeys("LTU");


    }

}
