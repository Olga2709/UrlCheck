package menubar;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class MainPage {
    ChromeDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "/home/jddeledrds/Desktop/UrlChecking-master/src/test/java/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://digiscorp.com/");

    }


    public String getExpectedLink (String xpathExpression) throws MalformedURLException {
        driver.findElement(By.xpath(xpathExpression)).click();
        String part = driver.findElement(By.xpath(xpathExpression)).getAttribute("href");
        URL myURL = new URL("https://digiscorp.com/");
        String expectedLink = new URL(myURL,part).toString();
        return expectedLink;

    }



    public String currentLink (){
        String actualLink = driver.getCurrentUrl();
        return actualLink;
    }



//    public String composeLink(String testPart) throws MalformedURLException {
//        URL myURL = new URL("https://digiscorp.com/");
//        String expectedLink = new URL(myURL, testPart).toString();
//        return expectedLink;
//    }
//    public String currentLink (){
//        String actualLink = driver.getCurrentUrl();
//        return actualLink;
//    }
    public void stop() {
        driver.quit();
    }
 }
