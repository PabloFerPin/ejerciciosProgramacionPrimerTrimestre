Algoritmo ejercicio11
	Definir numero como Entero
	Definir dia Como Entero
	
	Repetir
		Escribir 'Dame un numero y te digo el dia de la semana que es'
		Leer dia
		
		Segun dia Hacer
			1:
				Escribir 'Es lunes'
			2:
				Escribir 'Es Martes'
			3:
				Escribir 'Es Miercoles'
			4:
				Escribir 'Es Jueves'
			5:
				Escribir 'Es Viernes'
			6:
				Escribir 'Es Sabado'
			7:
				Escribir 'Es Domingo'
			De Otro Modo:
				Escribir 'Número no valido'
		Fin Segun
		
		si dia<=5 Entonces
			Escribir 'Es dia lectivo'
		sino
			Escribir 'Es dia no lectivo'
		FinSi
	Hasta Que dia>=8
FinAlgoritmo