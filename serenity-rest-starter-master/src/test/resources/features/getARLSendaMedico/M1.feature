Feature: Cobertura_Cliente

  Scenario Outline: Probar Servicio con Parametros
    Given Yo Llamo  GET <Cobertura>:
    When Seleccionamos Parametros
    Then La respuesta debe ser:
      | nombrePersona            | nombreEmpresa             | nit       | numeroContratoEmpresa | tipoTrabajador | estadoCobertura | fechaInicioVigencia | fechaFinVigencia    |
      | alfredo  herrera altamar | baño movil de colombia sa | 805009601 |                 87714 | D              | vigente         | 2010-05-25T00:00:00 | 2050-12-31T00:00:00 |

    Examples: 
      | Cobertura |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |         6 |
      |         7 |
      |         8 |
      |         9 |
      |        10 |
      |        11 |
      |        12 |
      |        13 |
      |        14 |
      |        15 |
      |        16 |
      |        17 |
      |        18 |
      |        19 |
      |        20 |
      |        21 |
      |        22 |
      |        23 |
      |        24 |
      |        25 |
      |        26 |
      |        27 |
      |        28 |
      |        29 |
      |        30 |
      |        31 |
      |        32 |
      |        33 |
      |        34 |
      |        35 |
      |        36 |
      |        39 |
      |        40 |
      |        41 |
      |        42 |
      |        43 |
      |        44 |
      |        45 |
      |        46 |
      |        47 |
      |        48 |
      |        49 |
      |        50 |
