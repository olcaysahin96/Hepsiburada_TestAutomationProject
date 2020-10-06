package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Steps extends Base {

    @Given("^I start the browser$")
    public void iStartTheBrowser() {
        SetUp();
    }

    @And("^I'm going to the hepsiburada page$")
    public void iGoingToTheHomePage() {
        driver.get(baseUrl);
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("myAccount")));
        loginButton.click();

        WebElement login = driver.findElement(By.id("login"));
        Actions(loginButton);
        Actions(login);
        login.click();
    }

    @And("^I'm filling in the username, password fields and clicking the login button$")
    public void iFillingInTheUsernameAndPasswordFields() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("txtUserName"));
        username.sendKeys(ePosta);

        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        txtPassword.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }

    @And("^I'm searching \"(.*)\"$")
    public void iSearchingSamsung(String searchProduct) {
        WebElement searchBox = driver.findElement(By.xpath(searchBoxOld));
        searchBox.sendKeys(searchProduct);

        WebElement searchButton = driver.findElement(By.xpath(searchButtonOld));
        searchButton.click();
    }

    @And("^I verify that there are products$")
    public void iVerifyThatThereAreProduct() {
        WebElement foundProductText = driver.findElement(By.xpath(productText));
        Assert.assertTrue(foundProductText.getText().contains("ürün bulduk."));
        System.out.println("Ürün bulundu!");
    }

    @And("^I add the Samsung product to the cart$")
    public void addTheSamsungProductToTheBasket() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement firstProduct = driver.findElement(By.xpath(firstSamsungProduct));
        firstProduct.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }

    @Then("^I add the product from another seller to the cart$")
    public void addTheAnotherProductToTheBasket() throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sellers = driver.findElement(By.xpath(allSellers));
        Actions(sellers);
        sellers.click();

        Thread.sleep(3000);
        WebElement addBasket = driver.findElement(By.xpath(addToBasket));
        addBasket.click();
        driver.findElement(By.xpath(continueToCart)).click();
        System.out.println("Başka bir satıcıdan ürün sepetinizde!");
    }

    @And("^I am adding the drone spare part to the basket$")
    public void addTheDroneSparePartToTheBasket() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement bookMusicMovieHobby = driver.findElement(By.xpath(bookMusicMovieHobbyMenu));
        bookMusicMovieHobby.click();
        WebElement remoteControlVehicle = driver.findElement(By.xpath(remoteControlVehicles));

        Actions(bookMusicMovieHobby);
        Actions(remoteControlVehicle);
        remoteControlVehicle.click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/img")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(droneSpareParts));
        Actions(element);
        element.click();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement droneSparePart = driver.findElement(By.xpath(thirdDroneProduct));
        Actions(droneSparePart);
        droneSparePart.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }

    @And("^I go to my cart$")
    public void iGoToMyCart() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement myCart = driver.findElement(By.id("shoppingCart"));
        myCart.click();
    }

    @And("^I click the complete the shopping$")
    public void iClickTheCompleteTheShopping() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(cssContinue)).click();
        WebElement completeShopping = driver.findElement(By.id("continue_step_btn"));
        completeShopping.click();
    }

    @And("^I add the AntremanBantLastigi product to the cart$")
    public void addTheLasticProductToTheBasket() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstProduct = driver.findElement(By.xpath(firstLasticProduct));
        firstProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }

    @And("^I see standard delivery sent by Hepsiburada$")
    public void iSeeStandardDeliveryByHepsiburada() {
        WebElement standard = driver.findElement(By.xpath(standardText));
        Actions(standard);
        Assert.assertTrue(standard.getText().contains("Standart Teslimat"));
    }

    @And("^I add the Atlamaİpi product to the cart$")
    public void addTheAtlamaIpiProductToTheBasket() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstProduct = driver.findElement(By.xpath(firstRopeProduct));
        firstProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }

    @And("^I see tomorrow delivery sent by Hepsiburada$")
    public void iSeeTomorrowDeliverySentByHepsiburada() {
        WebElement tomorrow = driver.findElement(By.xpath(tomorrowText));
        Actions(tomorrow);
        Assert.assertTrue(tomorrow.getText().contains("Yarın Teslimat"));
    }

    @And("^I add MicrosoftOffice product to the cart$")
    public void iAddMicrosoftOfficeProductToTheCart() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstProduct = driver.findElement(By.xpath(firstOfficeProduct));
        firstProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addTheProductToTheBasket = driver.findElement(By.id(addToCart));
        addTheProductToTheBasket.click();
    }

    @And("^I see instant delivery sent by Hepsiburada$")
    public void iSeeInstantDeliverySentByHepsiburada() throws InterruptedException {
        WebElement instant = driver.findElement(By.xpath(instantText));
        Actions(instant);
        Thread.sleep(5000);
        Assert.assertTrue(instant.getText().contains("Anında Teslimat"));
    }

    @Then("^I close the browser$")
    public void iCloseTheBrowser() {
        TearDown();
    }
}
