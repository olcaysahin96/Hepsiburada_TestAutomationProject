package ParallelTest;

import StepDefinitions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest2 extends Base {
    @BeforeMethod
    public void SetUp2(){
        SetUp();
    }
    @Test
    public void TestCase2() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement bookMusicMovieHobby = driver.findElement(By.xpath(bookMusicMovieHobbyMenu));
        bookMusicMovieHobby.click();
        WebElement remoteControlVehicle = driver.findElement(By.xpath(remoteControlVehicles));
        Actions actions = new Actions(driver);
        actions.moveToElement(bookMusicMovieHobby).build().perform();
        actions.moveToElement(remoteControlVehicle).build().perform();
        remoteControlVehicle.click();
        Thread.sleep(5000);
        //Scroll vertically down by 500 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(droneSpareParts)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement droneSparePart = driver.findElement(By.xpath(thirdDroneProduct));
        actions.moveToElement(droneSparePart).build().perform();
        droneSparePart.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }
    @AfterMethod
    public void TearDown2(){
        TearDown();
    }
}
