package by.it_academy_karpovich_anastasiya.ui.object;

import by.it_academy_karpovich_anastasiya.ui.utils.Random;


public class Student {
    private  String studentFirstName;
    private String studentLastName;
    private  String studentEmail;

    public Student() {
        this.studentFirstName = Random.generateText();
        this.studentLastName = Random.generateText();
        this.studentEmail = Random.generateText();
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}


