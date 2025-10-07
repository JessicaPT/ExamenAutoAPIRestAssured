Feature: Crear orden para la compra de mascota

  @consultaOrden
  Scenario: Crear orden

    When creo la orden con id 2 , petId 10 , quantity 1
    Then el codigo de respuesta es 200