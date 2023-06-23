package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WebTableTest extends BaseTest{

    @Test
    public void testAddingNewUserToWebTable(){
        getWebTablePage().open();
        getWebTablePage().clickOnAddButton();
        getWebTablePage().fillFirstNameField("John");
        getWebTablePage().fillLastNameField("Milton");
        getWebTablePage().fillEmailField("johnmilton23@gmail.com");
        getWebTablePage().fillAgeField("23");
        getWebTablePage().fillSalaryField("9999");
        getWebTablePage().fillDepartmentField("Parks and Rec");
        getWebTablePage().clickOnSubmitButton();
        Assert.assertTrue(getWebTablePage().getWebTableConvertedToText().contains("johnmilton23@gmail.com"));
    }
    @Test
    public void testEditingDataOfTheExistingUser(){
        getWebTablePage().open();
        getWebTablePage().clickOnEditButton();
        getWebTablePage().fillFirstNameField(" ");
        getWebTablePage().clearFirstNameField();
        getWebTablePage().fillFirstNameField("Milun");
        getWebTablePage().clickOnSubmitButton();
        Assert.assertTrue(getWebTablePage().getWebTableConvertedToText().contains("Milun"));
    }
    @Test
    public void testDeletingUser(){
        getWebTablePage().open();
        String webTableBeforeDeletion = getWebTablePage().getWebTableConvertedToText();
        getWebTablePage().clickOnDeleteUserButton();
        String webTableAfterDeletion = getWebTablePage().getWebTableConvertedToText();
        Assert.assertNotSame(webTableBeforeDeletion,webTableAfterDeletion);
    }
    @Test
    public void testRegisteringUserWithoutFillingAllField() throws InterruptedException {
        getWebTablePage().open();
        getWebTablePage().clickOnAddButton();
        getWebTablePage().fillFirstNameField("John");
        getWebTablePage().fillLastNameField("Milton");
        getWebTablePage().fillAgeField("23");
        getWebTablePage().fillSalaryField("9999");
        getWebTablePage().fillDepartmentField("Parks and Rec");
        getWebTablePage().clickOnSubmitButton();
        Assert.assertTrue(getWebTablePage().getRegistrationgFormTitle().isDisplayed());
    }

}
