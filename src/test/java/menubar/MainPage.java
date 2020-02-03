package menubar;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class MainPage {
    ChromeDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://digiscorp.com/");
    }

    public void clickonLinkMenu(String xpathExpression) {
        driver.findElement(By.xpath(xpathExpression)).click();
    }


    public String composeLink(String testPart) throws MalformedURLException {
        URL myURL = new URL("https://digiscorp.com/");
        String expectedLink = new URL(myURL, testPart).toString();
        return expectedLink;
    }
    public String currentLink (){
        String actualLink = driver.getCurrentUrl();
        return actualLink;
    }
    public void stop() {
        driver.quit();
    }
 }
