# language: es
# encoding: iso-8859-1
Feature: Ingreso a Amazonas
Caracter�stica: Impuestos
    
Escenario Outline: Pago de Seguridad Social PILA Exitoso
    Dado que ingreso al portal transaccional del banco
    Cuando inicio sesion en el Portal Transaccional
      | usuario 	        | contrase�a|
      | AutomatizacionICBS | Popular01*|
    Entonces valido la sesion en el portal transaccional
	Dado que ingreso a la opcion Seguridad Social PILA de Pagos
	Y ingreso los datos correspondiente para SSP
	|Tipo Producto  |Nombre Producto Origen|Operador de Informacion     |Modalidad Pago |	
	|Cuenta Ahorros |AHO6505               |PLANILLA ASISTIDA FEDECAJAS |PLANILLA       |
	
    Entonces salgo de la aplicacion	


	
	