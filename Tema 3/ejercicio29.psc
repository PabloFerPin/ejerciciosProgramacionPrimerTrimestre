Algoritmo ejercicio29
	Definir num1 Como Entero
	Definir num2 Como Entero
	
	Escribir 'Dame 2 numeros'
	Leer num1
	Leer num2
	
	Escribir 'Los numeros antes de la funcion son: ' num1 ' y ' num2
	intercambiar(num1,num2)
	Escribir 'Los numeros despues de la funcion son: ' num1 ' y ' num2
FinAlgoritmo

SubProceso intercambiar(varNum1 por referencia, varNum2 Por Referencia)
	varNum3=varNum1
	varNum1=varNum2
	varNum2=varNum3
FinSubProceso	