Algoritmo ejercicio20
	Definir pin como Entero
	Definir numero Como Entero
	Definir contador Como Entero
	Definir contador2 Como Entero
	Definir saldo Como Real
	Definir ingreso Como Real
	Definir retirada Como Real
	
	saldo=1000
	pin=2936
	
	Mientras contador<=2 Hacer
		Escribir 'Introduce su pin'
		Leer pin
		Si pin=2936 Entonces
			Escribir 'Pin correcto'
			Repetir
				Escribir '1 --> Consultar saldo'
				Escribir '2 --> Ingresar dinero'
				Escribir '3 --> Retirar dinero'
				Escribir '4 --> Salir'
				Leer numero
				Segun numero Hacer
					1:
						Escribir 'Su saldo es de: ' saldo ' euros'
					2:
						Escribir '¿Cuanto dinero desea ingresar?'
						Leer ingreso
						saldo=saldo+ingreso
						Escribir 'Introducca el dinero en la rendija'
					3:
						Escribir '¿Cuanto dinero desea retirar?'
						Leer retirada
						saldo=saldo-retirada
						Escribir 'Retire su dinero de la rendija'
					4:
						Escribir 'Saliendo'
						contador2=3
					De Otro Modo:
						Escribir 'Numero no valido'
				Fin Segun
			Hasta Que contador2=3
			contador=6
		SiNo
			Escribir 'Pin incorrecto'
		FinSi
		
		contador=contador+1
		
		si contador=3 Entonces
			Escribir 'Intentos agotados'
		FinSi
	Fin Mientras
FinAlgoritmo