Algoritmo ejercicio8
	Definir  caracter Como Caracter
	
	Repetir
		Escribir 'Dame un caracter'
		Leer Caracter
		
		Segun Caracter Hacer
			'a':
				Escribir 'Vocal'
			'e':
				Escribir 'Vocal'
			'i':
				Escribir 'Vocal'
			'o':
				Escribir 'Vocal'
			'u':
				Escribir 'Vocal'
			' ':
				Escribir 'Programa finalizado'
			De Otro Modo:
				Escribir 'Consonante'
		Fin Segun
	Hasta Que Caracter = ' '
FinAlgoritmo