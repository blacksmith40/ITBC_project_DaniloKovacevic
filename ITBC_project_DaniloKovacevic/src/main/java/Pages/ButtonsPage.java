package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    private WebElement doubleClickMeButton;
    private WebElement rightClickMeButton;
    private WebElement clickMeButton;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement clickMessage;
    private Actions action;
    private String doubleClickMessageToText;
    private String youHaveDoneADoubleClickMessage;
    private String rightClickMessageToText;
    private String youHaveDoneARightClick;
    public String getRightClickMessageToText() {
        rightClickMessageToText=getRightClickMessage().getText();
        return rightClickMessageToText;
    }

    public String getYouHaveDoneARightClick() {
        youHaveDoneARightClick="You have done a right click";
        return youHaveDoneARightClick;
    }



    public String getDoubleClickMessageToText() {
        doubleClickMessageToText=getDoubleClickMessage().getText();
        return doubleClickMessageToText;
    }

    public String getYouHaveDoneADoubleClickMessage() {
        youHaveDoneADoubleClickMessage="You have done a double click";
        return youHaveDoneADoubleClickMessage;
    }

    public Actions getAction() {
        action = new Actions(getDriver());
        return action;
    }
    public void doubleClickElement(WebElement element){
        getAction().doubleClick(element).perform();
    }
    public void rightClickElement(WebElement element){
        getAction().contextClick(element).perform();
    }



    public WebElement getDoubleClickMessage() {
        doubleClickMessage=getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        rightClickMessage=getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }

    public WebElement getClickMessage() {
        clickMessage=getDriver().findElement(By.id("dynamicClickMessage"));
        return clickMessage;
    }

    public WebElement getDoubleClickMeButton() {
        doubleClickMeButton=getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMeButton;
    }

    public WebElement getRightClickMeButton() {
        rightClickMeButton=getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeButton;
    }

    public WebElement getClickMeButton() {
        clickMeButton=getDriver().findElement(By.xpath("//button[text()='Click Me']"));
        return clickMeButton;
    }

    public void open(){
        getDriver().get("https://demoqa.com/buttons");
    }


    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
