Algoritmo ejercicio6
	Definir pagoMensual , pagoAcumulado Como Real
	Definir mes Como Entero
	
	pagoAcumulado=0
	pagoMensual=5
	
	Para mes=1 Hasta 12 Con Paso 1 Hacer
		pagoAcumulado = pagoMensual + pagoAcumulado
		pagoMensual = pagoMensual*2
	Fin Para
	
	Escribir pagoAcumulado
FinAlgoritmo