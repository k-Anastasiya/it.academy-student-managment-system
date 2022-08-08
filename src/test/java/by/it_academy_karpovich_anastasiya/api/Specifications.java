package by.it_academy_karpovich_anastasiya.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.http.ContentType.JSON;

public class Specifications {
    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("http://localhost:8080/")
                .setContentType(JSON)
                .setAccept(JSON)
                .build();
    }

    public static ResponseSpecification responseSpecificationOk(int code) {
        return new ResponseSpecBuilder()
                .expectContentType(JSON)
                .expectStatusCode(code)
                .build();
    }

    public static void installSpecification(RequestSpecification request, ResponseSpecification response) {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }

}
