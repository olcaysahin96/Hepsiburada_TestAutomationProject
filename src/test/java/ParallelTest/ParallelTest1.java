package ParallelTest;

import StepDefinitions.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTest1 extends Base {

    @BeforeMethod
    public void SetUp1(){
        SetUp();
    }
    @Test
    public void TestCase1() {
        driver.get(baseUrl);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("myAccount")));
        loginButton.click();
        WebElement login = driver.findElement(By.id("login"));
        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).build().perform();
        actions.moveToElement(login).build().perform();
        login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("txtUserName"));
        username.sendKeys(ePosta);
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        txtPassword.sendKeys(password);
        WebElement loginButton1 = driver.findElement(By.id("btnLogin"));
        loginButton1.click();
        WebElement searchBox = driver.findElement(By.xpath(searchBoxOld));
        searchBox.sendKeys("Samsung");
        WebElement searchButton = driver.findElement(By.xpath(searchButtonOld));
        searchButton.click();
        WebElement foundProductText = driver.findElement(By.xpath(productText));
        Assert.assertTrue(foundProductText.getText().contains("ürün bulduk."));
        System.out.println("Ürün bulundu!");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement firstProduct = driver.findElement(By.xpath(firstSamsungProduct));
        firstProduct.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
        //driver.findElement(By.cssSelector(closeBox)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sellers = driver.findElement(By.xpath(allSellers));
        actions.moveToElement(sellers).build().perform();
        sellers.click();
        WebElement addBasket = driver.findElement(By.xpath(addToBasket));
        addBasket.click();
        driver.findElement(By.xpath(continueToCart)).click();
        System.out.println("Başka bir satıcıdan ürün sepetinizde!");
    }
    @AfterMethod
    public void TearDown1(){
        TearDown();
    }
}
