package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Base {
    protected WebDriver driver;
    protected final String baseUrl = "https://www.hepsiburada.com";
    protected final String ePosta = "test.automation.project96@gmail.com";
    protected final String password = "Test2020";
    protected String searchBoxOld = "//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input";
    protected String searchButtonOld = "//*[@id=\"SearchBoxOld\"]/div/div/div[2]";
    protected String productText = "//*[@id=\"categorySuggestionList\"]/div[1]/span[3]";
    protected String firstSamsungProduct = "/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]";
    protected String allSellers = "//*[@id=\"merchantTabTrigger\"]/a/span";
    protected String addToBasket = "//*[@id=\"merchant-list\"]/tbody/tr[4]/td[4]/form/button";
    protected String continueToCart = "//*[@id=\"pcwrapper\"]/div/i";
    protected String addToCart = "addToCart";
    protected String bookMusicMovieHobbyMenu = "/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]";
    protected String remoteControlVehicles = "/html/body/div[3]/main/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/ul/li[9]/div/div/div[1]/div[2]/ul/li/ul[3]/li/a[3]/span";
    protected String droneSpareParts = "/html/body/div[3]/main/div[4]/div/div/div/div[1]/section/div[1]/div[2]/div/div/div/div/ul/li[8]";
    protected String thirdDroneProduct = "/html/body/div[3]/main/div[4]/div/div/div/div[2]/section/div[6]/div[3]/div/div/div/div/ul/li[3]";
    protected String firstLasticProduct = "/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[3]/div/div/div/div/ul/li";
    protected String firstRopeProduct = "/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[3]/div/div/div/div/ul/li[1]";
    protected String firstOfficeProduct = "/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[3]/div/div/div/div/ul/li[1]";
    protected String standardText = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/ul/li/label/div[2]/div[1]";
    protected String tomorrowText = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/ul/li[2]/label/div[2]/div[1]";
    protected String instantText = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[3]/div/div[2]/div[2]/ul/li/label/div[2]/div[1]";
    protected String cssContinue = ".basket_onboarding_112oM .onboarding_back_2zTkz";

    public void SetUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("disable-popup-blocking");
            options.addArguments("disable-web-security");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\olcay\\TestAutomationProject\\hepsiburada_TestAutomation\\Driver\\chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TearDown() {
        driver.close();
    }

    public void Actions(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }
}
