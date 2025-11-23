Funcion variableResultado = funcionMatematica(variableNumero)
	variableResultado=variableNumero/(1+variableNumero*variableNumero)
Fin Funcion

Algoritmo Funciones3
	Definir numero Como Real
	Definir resultado Como Real
	
	Escribir 'Dame un numero'
	Leer numero
	
	resultado=funcionMatematica(numero)
	
	Escribir 'El resultado es: ' resultado
FinAlgoritmo