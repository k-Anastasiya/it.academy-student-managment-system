package by.it_academy_karpovich_anastasiya.ui.page;

import by.it_academy_karpovich_anastasiya.ui.object.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateStudentPage {
    Student student;
    @FindBy(xpath = "//h1[contains(text(),'Update Student')]")
    private WebElement titleCreateNewStudent;
    @FindBy(xpath = "//label[contains(text(),'Student First Name')]")
    private WebElement labelStudentFirstName;
    @FindBy(xpath = "//label[contains(text(),'Student Last Name')]")
    private WebElement labelStudentLastName;
    @FindBy(xpath = "//label[contains(text(),'Student Email')]")
    private WebElement labelStudentEmail;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement inputLastName;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    public Boolean isTitleCreateNewStudentDisplayed() {
        return titleCreateNewStudent.isDisplayed();
    }

    public Boolean isLabelStudentFirstNameDisplayed() {
        return labelStudentFirstName.isDisplayed();
    }

    public Boolean isLabelStudentLastNameDisplayed() {
        return labelStudentLastName.isDisplayed();
    }

    public Boolean isLabelStudentEmailDisplayed() {
        return labelStudentEmail.isDisplayed();
    }

    public Boolean isButtonSubmitDisplayed() {
        return buttonSubmit.isDisplayed();
    }

    public UpdateStudentPage typeFirstName() {
        inputFirstName.sendKeys(student.getStudentFirstName());
        return this;
    }

    public UpdateStudentPage typeLastName() {
        inputFirstName.sendKeys(student.setStudentLastName());
        return this;

    }

    public UpdateStudentPage typeEmail() {
        inputFirstName.sendKeys(student.setStudentEmail());
        return this;
    }

    public UpdateStudentPage clickSubmit() {
        buttonSubmit.click();
        return this;
    }

}
