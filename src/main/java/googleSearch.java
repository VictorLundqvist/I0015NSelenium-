import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium jars and drivers\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1900, 1050));

       WebElement element = driver.findElement(By.name("q"));
       element.sendKeys("Software development");
       element.submit();


    }

}
