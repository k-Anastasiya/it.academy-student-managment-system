package by.it_academy_karpovich_anastasiya.ui.test;

import by.it_academy_karpovich_anastasiya.ui.page.CreateNewStudentPage;
import by.it_academy_karpovich_anastasiya.ui.page.HomePage;


import org.junit.jupiter.api.Test;
import org.testng.Assert;



public class CheckAddStudentPageTest {
    HomePage homePage;
    CreateNewStudentPage createNewStudentPage;

    @Test
    public void isTitleCreateNewStudentDisplayedTest(){
        homePage.openPage().clickButtonAddStudent();
        Assert.assertTrue(createNewStudentPage.isTitleCreateNewStudentDisplayed());
    }
    @Test
    public void isLabelStudentFirstNameDisplayedTest(){
        homePage.openPage().clickButtonAddStudent();
        Assert.assertTrue(createNewStudentPage.isLabelStudentFirstNameDisplayed());
    }
    @Test
    public void isLabelStudentLastNameDisplayedTest(){
        homePage.openPage().clickButtonAddStudent();
        Assert.assertTrue(createNewStudentPage.isLabelStudentLastNameDisplayed());
    }
    @Test
    public void isLabelStudentEmailDisplayedTest(){
        homePage.openPage().clickButtonAddStudent();
        Assert.assertTrue(createNewStudentPage.isLabelStudentEmailDisplayed());
    }
    @Test
    public void isButtonSubmitDisplayedTest(){
        homePage.openPage().clickButtonAddStudent();
        Assert.assertTrue(createNewStudentPage.isButtonSubmitDisplayed());
    }

}
