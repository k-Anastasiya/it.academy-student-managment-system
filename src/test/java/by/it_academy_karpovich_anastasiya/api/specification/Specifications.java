package by.it_academy_karpovich_anastasiya.api.specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class Specifications {
    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("http://localhost:8080")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecificationOk(int i) {
        return new ResponseSpecBuilder()
                .expectStatusCode(i)
                .build();
    }

    public static void installSpecification (RequestSpecification request,ResponseSpecification response) {
        RestAssured.requestSpecification=request;
        RestAssured.responseSpecification=response;
    }
}