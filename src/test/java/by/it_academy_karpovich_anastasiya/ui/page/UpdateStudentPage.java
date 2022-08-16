package by.it_academy_karpovich_anastasiya.ui.page;

import by.it_academy_karpovich_anastasiya.ui.object.Student;
import by.it_academy_karpovich_anastasiya.ui.utils.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateStudentPage extends BasePage {
    Student student;
    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement titleUpdateStudent;
    @FindBy(xpath = "//div[@class='form-group']//label[contains(text(),'Student First Name')]")
    private WebElement labelStudentFirstName;
    @FindBy(xpath = "//div[@class='form-group']//label[contains(text(),'Student Last Name')]")
    private WebElement labelStudentLastName;
    @FindBy(xpath = "//div[@class='form-group']//label[contains(text(),'Student Email')]")
    private WebElement labelStudentEmail;
    @FindBy(xpath = "//div[@class='box-footer']//button[contains(text(),'Submit')]")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//div[@class='form-group']//input[contains(@name,'firstName')]")
    private WebElement inputFirstName;
    @FindBy(xpath = "//div[@class='form-group']//input[contains(@name,'lastName')]")
    private WebElement inputLastName;
    @FindBy(xpath = "//div[@class='form-group']//input[contains(@name,'email')]")
    private WebElement inputEmail;

    public Boolean isTitleUpdateStudentDisplayed() {
        return titleUpdateStudent.isDisplayed();
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

    public UpdateStudentPage typeFirstName(Student student) {
        student.setStudentFirstName(Random.generateText());
        inputFirstName.sendKeys(student.getStudentFirstName());
        return this;
    }

    public UpdateStudentPage typeLastName(Student student) {
        student.setStudentLastName(Random.generateText());
        inputLastName.sendKeys(student.getStudentLastName());
        return this;
    }

    public UpdateStudentPage TypeEmail(Student student) {
        student.setStudentEmail(Random.generateText());
        inputEmail.sendKeys(student.getStudentEmail());
        return this;
    }

    public StudentsPage clickSubmit() {
        buttonSubmit.click();
        return new StudentsPage();
    }

    public UpdateStudentPage clearEmail() {
        inputEmail.clear();
        return this;
    }

    public UpdateStudentPage clearLastName() {
        inputLastName.clear();
        return this;
    }

    public UpdateStudentPage clearFirstName() {
        inputFirstName.clear();
        return this;
    }

}
