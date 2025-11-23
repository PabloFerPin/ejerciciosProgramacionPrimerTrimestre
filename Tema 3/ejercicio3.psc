Algoritmo ejercicio3
	//definimos variables
	Definir nota Como Entero
	
	//pedimos la nota
	Escribir 'Dame tu nota'
	Leer nota
	
	//comprobamos la nota
	Si nota = 0 o nota = 1 o nota = 2 o nota = 3 o nota = 4 Entonces
		Escribir 'Suspenso'
	SiNo
		Si nota = 5 Entonces
			Escribir 'Aprobado'
		SiNo
			Si nota = 6
				Escribir 'Bien'
			SiNo
				Si nota=7 o nota = 8
					Escribir 'Notable'
				SiNo
					Si nota = 9 o nota = 10
						Escribir 'Sobresaliente'
					SiNo
						Escribir 'Nota no válida'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo