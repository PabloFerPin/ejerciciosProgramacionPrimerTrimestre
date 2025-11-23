Algoritmo ejercicio10
	Definir numAleatorio Como Entero
	Definir num1 Como Entero
	
	numAleatorio = Aleatorio(1,50)
	Escribir numAleatorio
	contador=0
	contador2=6
	Repetir
		Escribir 'Dame un numero' 
		Leer num1
		
		Si num1=numAleatorio
			Escribir 'Has ganado'
			contador=5
		SiNo
			Si num1>numAleatorio
				Escribir 'El numero aleatorio es menor'
			SiNo
				Escribir 'El numero aleatorio es mayor'
			FinSi
		FinSi
		contador=contador+1
		contador2=contador2+1
	Hasta Que contador = 6
	
	si contador2=12 Entonces
		Escribir 'Intentos agotados'
	FinSi
FinAlgoritmo