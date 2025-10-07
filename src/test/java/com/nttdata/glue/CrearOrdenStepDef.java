package com.nttdata.glue;

import com.nttdata.steps.CrearOrdenStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearOrdenStepDef {
    @Steps
    CrearOrdenStep crearOrden;

    @When("creo la orden con id {int} , petId {int} , quantity {int}")
    public void crearOrden(int id, int petId, int quantity) {
        crearOrden.crearOrden(id,petId,quantity);

    }

    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        crearOrden.validarCodigoRespuesta(statusCode);

    }

    @Then("el código de la respuesta de orden es <statusCode>")
    public void elCódigoDeLaRespuestaDeOrdenEsStatusCode() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
