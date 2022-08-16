package by.it_academy_karpovich_anastasiya.ui.page;

import by.it_academy_karpovich_anastasiya.ui.object.Student;
import by.it_academy_karpovich_anastasiya.ui.utils.GetXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class StudentsPage extends BasePage {

    @FindBy(xpath = "//th[contains(text(),'Student First Name')]")
    private WebElement labelFirstName;
    @FindBy(xpath = "//th[contains(text(),'Student Last Name')]")
    private WebElement labelLastName;
    @FindBy(xpath = "//th[contains(text(),'Student Email')]")
    private WebElement labelStudentEmail;
    @FindBy(xpath = "//th[contains(text(),'Actions')]")
    private WebElement labelActions;
    @FindBy(xpath = "//a[contains(text(),'Add Student')]")
    private WebElement buttonAddStudent;
    @FindBy(xpath = "//a[contains(text(),'Update')]")
    private WebElement buttonUpdate;
    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    private WebElement buttonDelete;
    @FindBy(xpath = "//h1[contains(text(),'List Students')]")
    private WebElement labelTitle;
    @FindBy(xpath = "//h1[contains(text(),'Create New Student')]")
    private WebElement titleCreateNewStudent;

    public StudentsPage() {
    }


    public StudentsPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public Boolean isLabelFirstNameDisplayed() {
        return waitForVisibilityOfElement(labelFirstName).isDisplayed();
    }

    public Boolean isLabelLastNameDisplayed() {
        return labelLastName.isDisplayed();
    }

    public Boolean isLabelActionsNameDisplayed() {
        return waitForVisibilityOfElement(labelActions).isDisplayed();
    }

    public Boolean isLabelStudentEmailDisplayed() {
        return waitForVisibilityOfElement(labelStudentEmail).isDisplayed();
    }

    public Boolean isButtonAddStudentDisplayed() {
        return waitForVisibilityOfElement(buttonAddStudent).isDisplayed();
    }

    public Boolean isButtonUpdateDisplayed() {
        return waitForVisibilityOfElement(buttonDelete).isDisplayed();
    }

    public Boolean isButtonDeleteDisplayed() {
        return waitForVisibilityOfElement(buttonDelete).isDisplayed();
    }

    public Boolean isLabelTitleStudentDisplayed() {
        return waitForVisibilityOfElement(labelTitle).isDisplayed();
    }

    public CreateNewStudentPage clickButtonAddStudent() {
        buttonAddStudent.click();
        return new CreateNewStudentPage();
    }

    public StudentsPage buttonAddStudentClick() {
        buttonAddStudent.click();
        return this;
    }

    public UpdateStudentPage clickButtonUpdateStudent(Student student) {
        driver.findElement(GetXpath.getXpathFoUpdate(student)).click();
        return new UpdateStudentPage();
    }

    public StudentsPage clickButtonUpdateStudentWithoutOptions() {
        buttonUpdate.click();
        return this;
    }

    public StudentsPage clickButtonDelete(Student student) {
        driver.findElement(GetXpath.getXpathFoDelete(student)).click();
        return this;
    }

    public Boolean isNewStudentOnThePageDisplayed(Student student) {
        try {
            driver.findElement(GetXpath.getXpathForTable(student)).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}

