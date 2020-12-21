Feature: Direccionamientos

  Scenario Outline: Probar Servicio con Direccionamientos
    Given Yo Llamo  Direccionamientos Get <Direccionamientos>:
    When Seleccionamos Direccionamientos
    Then La resp Direccionamientos:
      | nombre                  | direccionNominal | codigoPrestador | latitud | longitud | telefonoCitas          | horarioApertura    | horarioCierre | marcacionCategoriaDireccionamiento | especialidad | subespecialidad |
      | CLINICA ATENAS LTDA IPS | CL 80 # 49C- 10  |         0000113 |  11.001 | -74.8132 | 3568383  /  3183383752 | URGENCIAS 24 HORAS |               | Preferencial                       |              |                 |

    Examples: 
      | Direccionamientos |
      |                 1 |
      |                 2 |
      |             3 |
      |             4 |
      |             5 |
      |             6 |
      |             7 |
      |             8 |
      |             9 |
      |            10 |
      |            11 |
      |            12 |
      |            13 |
      |            14 |
      |            15 |
      |            16 |
      |            17 |
      |            18 |
      |            19 |
      |            20 |
      |            21 |
      |            22 |
      |            23 |
      |            24 |
      |            25 |
      |            26 |
      |            27 |
      |            28 |
      |            29 |
      |            30 |
      |            31 |
      |            32 |
      |            33 |
      |            34 |
      |            35 |
      |            36 |
      |            39 |
      |            40 |
      |            41 |
      |            42 |
      |            43 |
      |            44 |
      |            45 |
      |            46 |
      |            47 |
      |            48 |
      |            49 |
      |            50 |
