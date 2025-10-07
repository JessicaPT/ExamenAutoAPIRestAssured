package com.nttdata;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.nttdata"},
        features = "classpath:features",
        tags = "@consultaOrden"   //  ==> Definir el @tag  a ejecutara
)
public class CucumberTestSuite {
}
