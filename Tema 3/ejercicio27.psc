Algoritmo ejercicio27
	Definir numero Como Entero
	
	Escribir 'Dame un numero'
	Leer numero
	
	Escribir 'El valor antes del procedimiento es: ' numero
	sumar10(numero)
	Escribir 'El valor despues del procedimiento es: ' numero
FinAlgoritmo

SubProceso sumar10(varNumero Por Referencia)
	varNumero=varNumero+10
FinSubProceso	