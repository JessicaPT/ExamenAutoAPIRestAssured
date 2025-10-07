package com.nttdata.steps;

import com.nttdata.model.Orden;
import io.restassured.response.Response;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConsultaOrdenStep {
    private String URL_BASE= "https://petstore.swagger.io/v2/store/";

    public Orden orden;
    public void consultarOrden(int id) {
        Response response = given()
                .baseUri(URL_BASE)
                .log()
                .all()
                .when()
                .get("order/" +id);
        if(response.statusCode() == 200){
            orden = response.as(Orden.class);
        } else if (response.statusCode() == 404){
            String message = response.toString();
            System.out.println(message);
        }
    }
    public void listarOrden(Orden orden){
        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println("Id: " + orden.getId());
        System.out.println("Id pet: " + orden.getPetId());
        System.out.println("Cantidad: " + orden.getQuantity());
        System.out.println("Fecha: " + orden.getShipDate());
        System.out.println("Estatus: " + orden.getStatus());
        System.out.println("Completo: " + orden.getComplete());
        System.out.println("@@@@@@@@@@@@@@@");
    }
    public void validarCodigoRespuesta(int statusCode){
        assertThat(lastResponse().statusCode(),is(statusCode));
    }
}
