package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebTablePage extends BasePage{
    private WebElement addNewUserButton;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement ageField;
    private WebElement salaryField;
    private WebElement departmentField;


    private WebElement wholeTable;

    public WebElement getRegistrationgFormTitle() {
        registrationgFormTitle=getDriver().findElement(By.id("registration-form-modal"));
        return registrationgFormTitle;
    }

    private WebElement registrationgFormTitle;

    public String getWebTableConvertedToText(){
        return getWholeTable().getText();
    }

    public WebElement getEditButton() {
        editButton=getDriver().findElement(By.id("edit-record-1"));
        return editButton;
    }
    public void clickOnEditButton(){
        getEditButton().click();
    }

    private WebElement editButton;
    public void clearFirstNameField(){
        firstNameField.clear();
    }




    public WebElement getSubmitButton() {
        submitButton=getDriver().findElement(By.id("submit"));
        return submitButton;
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }
    public void clickOnAddButton(){
        getAddNewUserButton().click();
    }

    private WebElement submitButton;

    public WebElement getDeleteUserButton() {
        deleteUserButton=getDriver().findElement(By.id("delete-record-1"));
        return deleteUserButton;
    }
    public void clickOnDeleteUserButton(){
        getDeleteUserButton().click();
    }

    private WebElement deleteUserButton;


    public WebElement getAddNewUserButton() {
        addNewUserButton=getDriver().findElement(By.id("addNewRecordButton"));
        return addNewUserButton;
    }

    public WebElement getFirstNameField() {
        firstNameField = getDriver().findElement(By.id("firstName"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField =getDriver().findElement(By.id("lastName"));
        return lastNameField;
    }

    public WebElement getEmailField() {
        emailField=getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getAgeField() {
        ageField= getDriver().findElement(By.id("age"));
        return ageField;
    }

    public WebElement getSalaryField() {
        salaryField=getDriver().findElement(By.id("salary"));
        return salaryField;
    }

    public WebElement getDepartmentField() {
        departmentField=getDriver().findElement(By.id("department"));
        return departmentField;
    }
    public void fillFirstNameField(String firstName){
        getFirstNameField().sendKeys(firstName);
    }
    public void fillLastNameField(String lastName){
        getLastNameField().sendKeys(lastName);
    }
    public void fillEmailField(String email){
        getEmailField().sendKeys(email);
    }
    public void fillAgeField(String age){
        getAgeField().sendKeys(age);
    }
    public void fillSalaryField(String salary){
        getSalaryField().sendKeys(salary);
    }
    public void fillDepartmentField(String department){
        getDepartmentField().sendKeys(department);
    }

    public WebTablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void open(){
        getDriver().get("https://demoqa.com/webtables");
    }

    public WebElement getWholeTable() {
        wholeTable=getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
        return wholeTable;
    }
}
