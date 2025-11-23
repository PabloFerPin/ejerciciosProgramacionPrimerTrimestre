Algoritmo Mixto
	Definir num1 Como Real
	Definir num2 Como Real
	Definir mayorIgual Como Logico
	Definir menorIgual Como Logico
	Definir cadena1 Como Caracter
	Definir cadena2 Como Caracter
	Definir cadena3 Como Caracter
	
	Escribir 'Dame un numero'
	Leer num1
	Escribir 'Dame otro numero'
	Leer num2
	Escribir 'Dame una cadena'
	Leer cadena1
	Escribir 'Dame otra cadena'
	Leer cadena2
	Escribir 'Dame una cadena mas'
	Leer cadena3
	
	mayorIgual = num1 >= num2
	menorIgual = num1 <= num2
	cadenaFinal = cadena1+cadena2+cadena3
	
	Escribir 'El numero 1 es mayor o igual que el numero 2?: ' mayorIgual
	Escribir 'El numero 1 es menor o igual que el numero 2?: ' menorIgual
	Escribir 'Su cadena concatenada es: ' cadenaFinal
FinAlgoritmo