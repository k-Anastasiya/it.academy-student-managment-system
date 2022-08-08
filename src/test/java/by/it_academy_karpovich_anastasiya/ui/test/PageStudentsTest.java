package by.it_academy_karpovich_anastasiya.ui.test;
import by.it_academy_karpovich_anastasiya.ui.driver.DriverSingleton;
import by.it_academy_karpovich_anastasiya.ui.page.CreateNewStudentPage;
import by.it_academy_karpovich_anastasiya.ui.page.HomePage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageStudentsTest{
    private static final WebDriver driver = DriverSingleton.getDriver();
    HomePage homePage;
    CreateNewStudentPage createNewStudentPage;
    @Test
    public void isDisplayedTitleLabeltest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isLabelTitleStudentDisplayed());
    }

    @Test
    public void isLabelFirstNameDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isLabelFirstNameDisplayed());
    }

    @Test
    public void isLabelLastNameDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isLabelLastNameDisplayed());
    }

    @Test
    public void isLabelActionsNameDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isLabelActionsNameDisplayed());
    }

    @Test
    public void isLabelStudentEmailDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isLabelStudentEmailDisplayed());
    }

    @Test
    public void isButtonAddStudentDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isButtonAddStudentDisplayed());
    }

    @Test
    public void isButtonUpdateDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isButtonUpdateDisplayed());
    }

    @Test
    public void isButtonDeleteDisplayedTest() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openPage().isButtonDeleteDisplayed());
    }
    @Test
    public void IsTitleCreateStudentDisplayedTest() {
        homePage = new HomePage();
        homePage.openPage().clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();
        Assert.assertTrue(createNewStudentPage.isTitleCreateNewStudentDisplayed());
    }
}
