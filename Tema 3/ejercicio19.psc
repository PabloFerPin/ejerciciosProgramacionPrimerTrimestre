Algoritmo ejercicio19
	Definir numero Como Entero
	Definir contador como entero
	
	Escribir 'Dame un numero'
	Leer numero
	
	
	Repetir
		division=division+1
		si numero%division=0
			hola=hola+1
		FinSi
	Hasta Que division=numero/2+1
	
	Si hola>=2
		Escribir 'si'
	SiNo
		Escribir 'no'
	FinSi
FinAlgoritmo