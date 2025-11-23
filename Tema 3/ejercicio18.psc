Algoritmo ejercicio18
	Definir numero Como Entero
	Definir suma Como Entero
	Definir media Como Real
	
	Repetir
		Escribir 'Dame un numero'
		Leer numero
		suma=suma+numero
		contador=contador+1
	Hasta Que numero<0
	
	Si contador<>1 Entonces
		suma=suma-numero
		contador=contador-1
		media=suma/contador
		Escribir 'La media de los nuemeros positivos que has introducido es: ' media
	SiNo
		Escribir 'No existe la media de los numeros positivos porque no has introducido numeros positvos'
	FinSi
FinAlgoritmo