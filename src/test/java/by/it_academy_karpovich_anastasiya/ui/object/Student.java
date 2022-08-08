package by.it_academy_karpovich_anastasiya.ui.object;

import org.apache.commons.lang3.RandomStringUtils;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private String studentEmail;

    public Student(String studentFirstName, String studentLastName, String studentEmail) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEmail = studentEmail;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String setStudentFirstName() {
      return   this.studentFirstName = RandomStringUtils.randomAlphabetic(10);
    }

    public String setStudentLastName() {
        return  this.studentLastName = RandomStringUtils.randomAlphabetic(10);
    }

    public String setStudentEmail() {
        return this.studentEmail = RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
    }
}
