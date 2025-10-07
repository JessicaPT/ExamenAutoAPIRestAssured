package com.nttdata.glue;

import com.nttdata.steps.ConsultaOrdenStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ConsultaOrdenStepDef {
    @Steps
    ConsultaOrdenStep consultaOrdenStep;

    @Given("estoy en la pagina de Store")
    public void estoyEnLaPaginaDeStore() {

    }

    @When("hago la consulta de la orden con el id {int}")
    public void hagoLaConsultaDeLaOrdenConElIdId(int id) {
        consultaOrdenStep.consultarOrden(id);
    }

    @Then("el código de la respuesta de orden es {int}")
    public void elCódigoDeLaRespuestaDeOrdenEsStatusCode(int statusCode) {
         consultaOrdenStep.validarCodigoRespuesta(statusCode);
    }
}
