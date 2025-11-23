Algoritmo ejercicio5_2
	//Definir las variables
	Definir num1 Como Entero
	
	//pedimos la variable
	Escribir 'Dame un dia de la semana'
	Leer num1
	
	//comprobamos el dia
	Si num1=1 Entonces
		Escribir 'Lunes'
	SiNo
		Si num1=2 Entonces
			Escribir 'Martes'
		SiNo
			Si num1=3
				Escribir 'Miercoles'
			SiNo
				Si num1=4
					Escribir 'Jueves'
				SiNo
					Si num1=5
						Escribir 'Viernes'
					SiNo
						Si num1=6
							Escribir 'Sabado'
						SiNo
							si num1=7
								Escribir 'Domingo'
							SiNo
								Escribir 'Dia no valido'
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo