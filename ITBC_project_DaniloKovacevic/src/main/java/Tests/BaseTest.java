package Tests;

import Pages.ApplicationFormPage;
import Pages.ButtonsPage;
import Pages.WebTablePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;


public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebTablePage webTablePage;
    private ApplicationFormPage applicationFormPage;
    private ButtonsPage buttonsPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
        "D:\\Documents from C\\Desktop\\IT bootcamp\\ChromeDrive//chromedriver.exe");
        driver = (WebDriver) new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        webTablePage = new WebTablePage(driver,wait);
        applicationFormPage=new ApplicationFormPage(driver,wait);
        buttonsPage=new ButtonsPage(driver,wait);
        driver.manage().window().maximize();


    }
    @AfterClass
    public void closeDriver(){
        getDriver().close();
    }
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
    public WebTablePage getWebTablePage(){
        return webTablePage;
    }
    public ApplicationFormPage getApplicationFormPage(){
        return applicationFormPage;
    }
    public ButtonsPage getButtonsPage(){return buttonsPage;}
}
