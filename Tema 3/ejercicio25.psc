Algoritmo ejercicio25
	Definir numero Como Entero
	Definir atun Como Logico
	
	Escribir 'Dame un numero'
	Leer numero
	
	resultado=ParOImpar(numero)
	
	Escribir atun
FinAlgoritmo

Funcion varResultado=ParOImpar(varNumero)
	Si varNumero%2=0 Entonces
		atun=Verdadero
	sino
		atun=Falso
	FinSi
FinFuncion	