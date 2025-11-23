Algoritmo CompracionEntre2Numeros
	Definir num1 Como Entero	
	Definir num2 Como Entero
	Definir resultadoMenor Como Logico
	Definir resultadoMayor Como Logico
	Definir resultadoIgual Como Logico
	Definir resultadoDistinto Como Logico
	
	Escribir 'Dame un numero'
	Leer num1
	Escribir 'Dame otro numero'
	Leer num2
	
	resultadoMenor = num1 < num2
	resultadoMayor = num1 > num2
	resultadoIgual = num1 = num2
	resultadoDistinto = num1 <> num2
	
	Escribir '¿El num 1 es menor que el numero 2?: ' resultadoMenor
	Escribir '¿El num 1 es mayor que el numero 2?: ' resultadoMayor
	Escribir '¿El num 1 es igual que el numero 2?: ' resultadoIgual
	Escribir '¿El num 1 es distinto del numero 2?: ' resultadoDistinto
FinAlgoritmo