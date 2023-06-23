package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationFormPage extends BasePage{
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement genderMale;
    private WebElement genderFemale;
    private WebElement genderOther;
    private WebElement mobilePhoneField;
    private WebElement calendarField;
    private WebElement subjectsField;
    private WebElement hobbySportCheckBox;
    private WebElement hobbyReadingCheckBox;
    private WebElement hobbyMusicCheckBox;
    private WebElement chooseAPictureButton;
    private WebElement currentAddresField;
    private WebElement stateDropList;
    private WebElement cityDropList;
    private WebElement submitButton;
    private Color colourRed;
    private Color firstNameBorderColor;

    public Color getColourRed() {
        colourRed=Color.fromString("rgb(220, 53, 69)");
        return colourRed;
    }

    public Color getFirstNameBorderColor() {
        firstNameBorderColor=Color.fromString(getFirstNameField().getCssValue("border-color"));
        return firstNameBorderColor;
    }





    public WebElement getApplicationFormSubmitted() {
        applicationFormSubmitted=getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table"));
        return applicationFormSubmitted;
    }

    public String submitterApplicationFormToText(){
        return getApplicationFormSubmitted().getText();
    }
    private WebElement applicationFormSubmitted;


    public WebElement getThankYouForSubmittingFormNotification() {
        thankYouForSubmittingFormNotification=getDriver().findElement(By.cssSelector("#example-modal-sizes-title-lg"));
        return thankYouForSubmittingFormNotification;
    }

    private WebElement thankYouForSubmittingFormNotification;


    public WebElement getFirstNameField() {
        firstNameField=getDriver().findElement(By.id("firstName"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField=getDriver().findElement(By.id("lastName"));
        return lastNameField;
    }

    public WebElement getEmailField() {
        emailField=getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getGenderMale() {
        genderMale=getDriver().findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
        return genderMale;
    }

    public WebElement getGenderFemale() {
        genderFemale=getDriver().findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"));
        return genderFemale;
    }

    public WebElement getGenderOther() {
        genderOther= getDriver().findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"));
        return genderOther;
    }

    public WebElement getMobilePhoneField() {
        mobilePhoneField=getDriver().findElement(By.id("userNumber"));
        return mobilePhoneField;
    }

    public WebElement getCalendarField() {
        calendarField=getDriver().findElement(By.id("dateOfBirthInput"));
        return calendarField;
    }

    public WebElement getSubjectsField() {
        subjectsField=getDriver().findElement(By.id("subjectsContainer"));
        return subjectsField;
    }

    public WebElement getHobbySportCheckBox() {
        hobbySportCheckBox=getDriver().findElement(By.id("hobbies-checkbox-1"));
        return hobbySportCheckBox;
    }

    public WebElement getHobbyReadingCheckBox() {
        hobbyReadingCheckBox=getDriver().findElement(By.id("hobbies-checkbox-2"));
        return hobbyReadingCheckBox;
    }

    public WebElement getHobbyMusicCheckBox() {
        hobbyMusicCheckBox=getDriver().findElement(By.id("hobbies-checkbox-3"));
        return hobbyMusicCheckBox;
    }

    public WebElement getChooseAPictureButton() {
        chooseAPictureButton=getDriver().findElement(By.id("uploadPicture"));
        return chooseAPictureButton;
    }

    public WebElement getCurrentAddresField() {
        currentAddresField=getDriver().findElement(By.id("currentAddress"));
        return currentAddresField;
    }

    public WebElement getStateDropList() {
        stateDropList=getDriver().findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        return stateDropList;
    }

    public WebElement getCityDropList() {
        cityDropList=getDriver().findElement(By.cssSelector("#city > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        return cityDropList;
    }

    public WebElement getSubmitButton() {
        submitButton=getDriver().findElement(By.id("submit"));
        return submitButton;
    }
    public void open(){
        getDriver().get("https://demoqa.com/automation-practice-form");
    }
    public void submitForm(){
        getSubmitButton().submit();
    }
    public void fillFirstNameField(String firstNmae){
        getFirstNameField().sendKeys(firstNmae);
    }
    public void fillLastNameField(String lastName){
        getLastNameField().sendKeys(lastName);
    }
    public void fillMobilePhoneNumber(String numbers){
        getMobilePhoneField().sendKeys(numbers);
    }
    public void chooseGenderMale(){
        getGenderMale().click();
    }
    public void chooseGenderFemale(){
        getGenderFemale().click();
    }
    public void chooseGenderOther(){
        getGenderOther().click();
    }
    //DesiredCapabilities dc=new DesiredCapabilities();
   //dc.setCapability("screen-resolution","1280x1024");

    public ApplicationFormPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
