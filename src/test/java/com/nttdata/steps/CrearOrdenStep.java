package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearOrdenStep {
    private static String CREATE_ORDEN = "https://petstore.swagger.io/v2/store/order";
    @Step ("Crear orden {0} en PetStore")
    public void crearOrden(int id, int petId, int quantity){
        String shipDate= ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT);

        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": "+id+",\n" +
                        "  \"petId\": "+petId+",\n" +
                        "  \"quantity\": "+quantity+",\n" +
                        "  \"shipDate\": \""+shipDate+"\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDEN)
                .then()
                .log().all()
        ;
    }
    public void validarCodigoRespuesta(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
