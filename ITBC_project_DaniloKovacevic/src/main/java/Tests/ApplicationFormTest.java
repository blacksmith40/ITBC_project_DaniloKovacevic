package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ApplicationFormTest extends BaseTest{
    @Test
    public void verifyingUserCanSignUpWithOnlyFillingRequiredFields(){
        getApplicationFormPage().open();
        getApplicationFormPage().fillFirstNameField("John"); //ovo je metoda za Send keys
        getApplicationFormPage().fillLastNameField("Milton");
        getApplicationFormPage().chooseGenderMale();
        getApplicationFormPage().fillMobilePhoneNumber("0613948390");
        getApplicationFormPage().submitForm();
        Assert.assertTrue(getApplicationFormPage().getThankYouForSubmittingFormNotification().isDisplayed());
        Assert.assertTrue(getApplicationFormPage().submitterApplicationFormToText().contains("0613948390"));

    }
    @Test
    public void verifyingUserCannotSignUpWithoutFillingRequiredFieldsFilled(){
        getApplicationFormPage().open();
        getApplicationFormPage().submitForm();
        Assert.assertEquals(getApplicationFormPage().getColourRed(), getApplicationFormPage().getFirstNameBorderColor());




    }

}
