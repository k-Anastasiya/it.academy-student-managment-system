package by.it_academy_karpovich_anastasiya.ui.utils;

import by.it_academy_karpovich_anastasiya.ui.object.Student;
import org.openqa.selenium.By;

public class GetXpath {
    public static By getXpathForTable(Student student){
        return By.xpath("//td[contains(text()," + "'" +
                student.getStudentEmail() + "'" + ")]");
    }
    public static By getXpathFoDelete(Student student){
        return By.xpath("//td[contains(text()," + "'" +
                student.getStudentEmail() + "'" + ")]" + "//..//a[text()='Delete']");
    }
    public static By getXpathFoUpdate(Student student){
        return By.xpath("//td[contains(text()," + "'" +
                student.getStudentEmail() + "'" + ")]" + "//..//a[text()='Update']");
    }
}
