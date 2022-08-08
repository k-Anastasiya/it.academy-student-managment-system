package by.it_academy_karpovich_anastasiya.api.test;

import by.it_academy_karpovich_anastasiya.api.Specifications;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void getRequestEndPoint(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        int response = given()
                .when()
                .get("students/")
                .then().log().all()
                .extract().statusCode();
    }
    @Test
    public void postRequestAddNewStudent(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        Map<String,String> student = new HashMap<>();
        student.put("firstName","asdfgh");
        student.put("lastName","asdfgh");
        student.put("email" , "asdfgghhj");
        int response = given()
                .body(student)
                .when()
                .post("students/1")
                .then().log().all()
                .extract().statusCode();
    }
    @Test
    public void deleteRequestEndPoint(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        int response = given()
                .when()
                .delete("/students/3")
                .then().log().all()
                .extract().statusCode();
    }
    Test
    public void patchRequestUpdatetudent(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        Map<String,String> student = new HashMap<>();
        student.put("firstName","jkhjjjjh");
        student.put("lastName","gggjhhgh");
        student.put("email" , "ghggghhggh");
        int response = given()
                .body(student)
                .when()
                .patch("/students/2")
                .then().log().all()
                .extract().statusCode();
    }

    }
}
