Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Pago de Seguridad Social PILA Exitoso
    Given que ingreso al portal transaccional del banco
    When inicio sesion en el Portal Transaccional
      | usuario            | contrase�a |
      | AutomatizacionICBS | Popular01* |
    Then valido la sesion en el portal transaccional
    And que ingreso a la opcion Seguridad Social PILA de Pagos
    And ingreso los datos correspondiente para SSP
      | Tipo Producto  | Nombre Producto Origen | Operador de Informacion     | Modalidad Pago |
      | Cuenta Ahorros | AHO6505                | PLANILLA ASISTIDA FEDECAJAS | PLANILLA       |
    And salgo de la aplicacion

    
    @Given("^me logueo al aplicativo planet como \"([^\"]*)\" con pass \"([^\"]*)\"$")