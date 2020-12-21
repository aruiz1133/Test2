

Feature: Listado Accidentes

  Scenario Outline: Probar Servicio con Parametros
    Given Yo Llamo get archivo <ListaAccidentes>:
    When Definimos Campos
    Then Resultado:
      | numeroAt | fechaOcurrencia     | origen | cobertura | marcacionTutela | tipoTrabajador | nombreMedicoResponsable | correoMedicoResponsable  |
      | L8002111 | 2020-08-26T06:00:00 | P      | A         | false           | D              | nathalie Castro         | desarprecibe@bcsc.com.co |

    Examples: 
      | ListaAccidentes |
      |               1 |
      |               2 |
      |               3 |
      |               4 |
      |               5 |
      |               6 |
      |               7 |
      |               8 |
      |               9 |
      |              10 |
      |              11 |
      |              12 |
      |              13 |
      |              14 |
      |              15 |
      |              16 |
      |              17 |
      |              18 |
      |              19 |
      |              20 |
      |              21 |
      |              22 |
      |              23 |
      |              24 |
      |              25 |
      |              26 |
      |              27 |
      |              28 |
      |              29 |
      |              30 |
      |              31 |
      |              32 |
      |              33 |
      |              34 |
      |              35 |
      |              36 |
      |              39 |
      |              40 |
      |              41 |
      |              42 |
      |              43 |
      |              44 |
      |              45 |
      |              46 |
      |              47 |
      |              48 |
      |              49 |
      |              50 |
