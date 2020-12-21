Feature: Pago Exitoso

  Scenario Outline: Probar Pago Gas
    Given Cargamos Archivo  GET <Gas>:
    When Seleccionamos Facturas
    Then Codigo:
      | Pago exitoso |
      |           00 |

    Examples: 
      | Gas |
      |   1 |
      |   2 |
      |   3 |
      |   4 |
      |   5 |
      |   6 |
      |   7 |
      |   8 |
      |   9 |
      |  10 |
      |  11 |
      |  12 |
