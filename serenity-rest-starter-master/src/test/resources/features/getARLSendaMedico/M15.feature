Feature: Informe Autorizacion

  Scenario Outline: Test Autorizacion
    Given Analizamos archivo Get <Autorizacion>:
    When Partimos campos
    Then obtememos Campos:
      | atencionIncialUrgencia | prestadorAtencionIncialUrgenciaModel | nombrePrestador                        |
      | True                   |                                    0 | CLINICA NUESTRA SEÑORA DE LOS REMEDIOS |

    Examples: 
      | Autorizacion |
      |            1 |
      |            2 |
      |            3 |
      |            4 |
      |            5 |
      |            6 |
      |            7 |
      |            8 |
      |            9 |
      |           10 |
      |           11 |
      |           12 |
      |           13 |
      |           14 |
      |           15 |
      |           16 |
      |           17 |
      |           18 |
      |           19 |
      |           20 |
      |           21 |
      |           22 |
      |           23 |
      |           24 |
      |           25 |
      |           26 |
      |           27 |
      |           28 |
      |           29 |
      |           30 |
      |           31 |
      |           32 |
      |           33 |
      |           34 |
      |           35 |
      |           36 |
      |           39 |
      |           40 |
      |           41 |
      |           42 |
      |           43 |
      |           44 |
      |           45 |
      |           46 |
      |           47 |
      |           48 |
      |           49 |
      |           50 |
