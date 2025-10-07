Feature: consulta de una orden

  @consultaOrden
  Scenario Outline: consulta una Orden por id

    Given estoy en la pagina de Store
    When hago la consulta de la orden con el id <id>
    Then el código de la respuesta de orden es <statusCode>

    Examples:
      | id        | statusCode |
      | 1         | 200        |
      | 2         | 200        |
      | 3         | 200        |