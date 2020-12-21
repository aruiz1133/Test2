Feature: Consultar Casos

  Scenario Outline: Test Consulta Casos
    Given  Sube archivo Get <ConsultaCasos>:
    When Separamos campo a campo
    Then llega Campos:
      | numeroAt | estadoCobertura | origen | estadoCaso | diagnostico | marcacionTutela | ciudadOcurrenciaAccidente | descripcion       | severidad | tipificacion | jornada | agente | quienReporta | horaFechaAccidente | sitioOcurrencia | marcaccionHorariAlmuerzo | ladoEspecificoDelCuerpoAfectada | mecanismo | lesion | procesamientoAIU |
      | L8001850 | A               | P      |          1 | Z208        | false           |                     11001 | Resumen Del Caso: |         5 |            5 |       1 | null   |            2 | 020-06-21T15:00:00 |               1 | null                     |                             320 |         8 |     99 | true             |

    Examples: 
      | ConsultaCasos |
      |             1 |
      |           2 |
      |           3 |
      |           4 |
      |           5 |
      |           6 |
      |           7 |
      |           8 |
      |           9 |
      |          10 |
      |          11 |
      |          12 |
      |          13 |
      |          14 |
      |          15 |
      |          16 |
      |          17 |
      |          18 |
      |          19 |
      |          20 |
      |          21 |
      |          22 |
      |          23 |
      |          24 |
      |          25 |
      |          26 |
      |          27 |
      |          28 |
      |          29 |
      |          30 |
      |          31 |
      |          32 |
      |          33 |
      |          34 |
      |          35 |
      |          36 |
      |          39 |
      |          40 |
      |          41 |
      |          42 |
      |          43 |
      |          44 |
      |          45 |
      |          46 |
      |          47 |
      |          48 |
      |          49 |
      |          50 |