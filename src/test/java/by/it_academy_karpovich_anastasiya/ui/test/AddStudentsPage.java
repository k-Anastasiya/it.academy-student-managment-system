package by.it_academy_karpovich_anastasiya.ui.test;

import by.it_academy_karpovich_anastasiya.ui.object.Student;
import by.it_academy_karpovich_anastasiya.ui.page.CreateNewStudentPage;
import by.it_academy_karpovich_anastasiya.ui.page.StudentsPage;
import org.junit.Assert;
import org.junit.Test;


public class AddStudentsPage extends BaseTest {
    StudentsPage studentsPage;
    CreateNewStudentPage createNewStudentPage;

    @Test
    public void isTitleCreateNewStudentDisplayedTest() {
        new StudentsPage()
                .openPage()

                .clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isTitleCreateNewStudentDisplayed());
    }

    @Test
    public void isLabelStudentFirstNameDisplayedTest() {
        new StudentsPage().openPage()

                .clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isLabelStudentFirstNameDisplayed());
    }

    @Test
    public void isLabelStudentLastNameDisplayedTest() {
        new StudentsPage().openPage()

                .clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isLabelStudentLastNameDisplayed());
    }

    @Test
    public void isLabelStudentEmailDisplayedTest() {
        new StudentsPage().openPage()

                .clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isLabelStudentEmailDisplayed());
    }

    @Test
    public void isButtonSubmitDisplayedTest() {
        new StudentsPage().openPage()

                .clickButtonAddStudent();
        createNewStudentPage = new CreateNewStudentPage();

        Assert.assertTrue(createNewStudentPage.isButtonSubmitDisplayed());
    }

    @Test
    public void fillFormValidDateTest() {
        Student student = new Student();
        StudentsPage studentsPage = new StudentsPage()
                .openPage()
                .clickButtonAddStudent()
                .typeFirstName(student)
                .typeLastName(student)
                .typeEmail(student)
                .clickSubmit();

        Assert.assertTrue(studentsPage.isNewStudentOnThePageDisplayed(student));
    }
}
