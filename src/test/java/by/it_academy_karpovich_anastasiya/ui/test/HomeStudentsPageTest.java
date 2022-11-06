package by.it_academy_karpovich_anastasiya.ui.test;

import by.it_academy_karpovich_anastasiya.ui.page.CreateNewStudentPage;
import by.it_academy_karpovich_anastasiya.ui.page.StudentsPage;
import org.junit.Assert;
import org.junit.Test;


public class HomeStudentsPageTest extends BaseTest {
    StudentsPage studentsPage;

    @Test
    public void checkAllLabelContainsInHomePageTest() {
        StudentsPage studentsPage = new StudentsPage().openPage();

        Assert.assertTrue(studentsPage.isButtonDeleteDisplayed());
        Assert.assertTrue(studentsPage.isButtonUpdateDisplayed());
        Assert.assertTrue(studentsPage.isLabelStudentEmailDisplayed());
        Assert.assertTrue(studentsPage.isButtonAddStudentDisplayed());
        Assert.assertTrue(studentsPage.isLabelActionsNameDisplayed());
        Assert.assertTrue(studentsPage.isLabelLastNameDisplayed());
        Assert.assertTrue(studentsPage.isLabelFirstNameDisplayed());
        Assert.assertTrue(studentsPage.isLabelTitleStudentDisplayed());
    }


    @Test
    public void IsTitleCreateStudentDisplayedTest() {
        StudentsPage studentsPage = new StudentsPage()
                .openPage()

                .buttonAddStudentClick();
        CreateNewStudentPage createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isTitleCreateNewStudentDisplayed());
    }
}
