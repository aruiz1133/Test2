# language: es
# encoding: iso-8859-1
Característica: Impuestos

Escenario: Pago de Impuestos Exitoso
    Dado que ingreso al portal transaccional del banco
    Cuando inicio sesion en el Portal Transaccional
      | usuario 	        | contraseña|
      | AutomatizacionICBS | Popular01*|
    Entonces valido la sesion en el portal transaccional
	Dado que ingreso a la opcion Impuestos de Pagos
	Y ingreso los datos correspondiente
	|Tipo Producto  |Nombre Producto Origen|Ciudad     |
	|Cuenta Ahorros |AHO6505               |BOGOTA D.C.|
	
    Entonces salgo de la aplicacion	
	
Escenario: Pago de Impuestos Inexistente
    Dado que ingreso al portal transaccional del banco
    Cuando inicio sesion en el Portal Transaccional
      | usuario 	        | contraseña|
      | AutomatizacionICBS | Popular01*|
    Entonces valido la sesion en el portal transaccional
	Dado que ingreso a la opcion Impuestos de Pagos
	Y ingreso los datos correspondiente
	|Tipo Producto  |Nombre Producto Origen|Ciudad     |
	|Cuenta Ahorros |AHO6505               |BOGOTA D.C.|
	
    Entonces salgo de la aplicacion	

Escenario: Pago de Impuestos Otro Operador
    Dado que ingreso al portal transaccional del banco
    Cuando inicio sesion en el Portal Transaccional
      | usuario 	        | contraseña|
      | AutomatizacionICBS | Popular01*|
    Entonces valido la sesion en el portal transaccional
	Dado que ingreso a la opcion Impuestos de Pagos
	Y ingreso los datos correspondiente
	|Tipo Producto  |Nombre Producto Origen|Ciudad     |
	|Cuenta Ahorros |AHO6505               |BOGOTA D.C.|
	
    Entonces salgo de la aplicacion		
    
