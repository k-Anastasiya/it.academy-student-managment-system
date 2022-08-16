package by.it_academy_karpovich_anastasiya.api.test;

import by.it_academy_karpovich_anastasiya.api.specification.Specifications;
import by.it_academy_karpovich_anastasiya.ui.utils.Random;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void getRequestEndPoint() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        ValidatableResponse response = given()
                .when()
                .get("/students")
                .then().log().all();
    }

    @Test
    public void createRequestAddNewStudent() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(302));
        given()
                .queryParam("firstName", Random.generateText())
                .queryParam("lastName", Random.generateText())
                .queryParam("email", Random.generateText())
                .post("/students")
                .then().log().all();
    }

    @Test
    public void deleteRequestEndPoint() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));
        Integer response = given()
                .when()
                .delete("/students/1")
                .then().log().all()
                .extract().statusCode();
    }

    @Test
    public void patchRequestUpdateStudent() {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(302));
        given()
                .queryParam("firstName", Random.generateText())
                .queryParam("lastName", Random.generateText())
                .queryParam("email", Random.generateText())
                .patch("/students/2")
                .then().log().all();
    }
}