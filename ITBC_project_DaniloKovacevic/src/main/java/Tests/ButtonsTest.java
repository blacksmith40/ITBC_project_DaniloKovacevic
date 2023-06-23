package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test
    public void verifyingDoubleClickIsWorkingOnDoubleClickMeButton(){
        getButtonsPage().open();
        getButtonsPage().doubleClickElement(getButtonsPage().getDoubleClickMeButton());
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().isDisplayed());
        Assert.assertEquals(getButtonsPage().getDoubleClickMessageToText(),getButtonsPage().getYouHaveDoneADoubleClickMessage());
    }
    @Test
    public void verifyingRightClickWorksOnRightClickButton(){
        getButtonsPage().open();
        getButtonsPage().rightClickElement(getButtonsPage().getRightClickMeButton());
        Assert.assertEquals(getButtonsPage().getRightClickMessageToText(),getButtonsPage().getYouHaveDoneARightClick());
    }
    @Test
    public void verifyingClickWorksOnClickMeButton(){
        getButtonsPage().open();
        getButtonsPage().getClickMeButton().click();
        Assert.assertTrue(getButtonsPage().getClickMessage().isDisplayed());
        Assert.assertEquals(getButtonsPage().getClickMessage().getText(),"You have done a dynamic click");
    }
    @Test
    public void verifyingDoubleClickWorksOnAClickMeButton(){
        getButtonsPage().open();
        getButtonsPage().doubleClickElement(getButtonsPage().getClickMeButton());
        Assert.assertTrue(getButtonsPage().getClickMessage().isDisplayed());
    }


}
