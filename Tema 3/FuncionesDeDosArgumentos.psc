Funcion variableResultado=MultiplicacionDeDosNumeros(variableNumero, variableNumero2)
	variableResultado=variableNumero*variableNumero2
FinFuncion

Algoritmo FuncionesDeDosArgumentos
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir resultado Como Entero
	
	Escribir 'Dame un numero'
	Leer num1
	Escribir 'Dame otro numero'
	Leer num2
	
	resultado=MultiplicacionDeDosNumeros(num1,num2)
	
	Escribir resultado
FinAlgoritmo