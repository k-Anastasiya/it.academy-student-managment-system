package by.it_academy_karpovich_anastasiya.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

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
    @FindBy(xpath = "//td")
    private WebElement input;

    public HomePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public Boolean isLabelFirstNameDisplayed() {
        return labelFirstName.isDisplayed();
    }

    public Boolean isLabelLastNameDisplayed() {
        return labelLastName.isDisplayed();
    }

    public Boolean isLabelActionsNameDisplayed() {
        return labelActions.isDisplayed();
    }

    public Boolean isLabelStudentEmailDisplayed() {
        return labelStudentEmail.isDisplayed();
    }

    public Boolean isButtonAddStudentDisplayed() {
        return buttonAddStudent.isDisplayed();
    }

    public Boolean isButtonUpdateDisplayed() {
        return buttonDelete.isDisplayed();
    }

    public Boolean isButtonDeleteDisplayed() {
        return buttonDelete.isDisplayed();
    }

    public Boolean isLabelTitleStudentDisplayed() {
        return labelTitle.isDisplayed();
    }

    public HomePage clickButtonAddStudent() {
        buttonAddStudent.click();
        return this;
    }

    public HomePage clickButtonUpdateStudent() {
        buttonUpdate.isDisplayed();
        return this;
    }

}
