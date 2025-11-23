Algoritmo ejercicio21
	Definir nota Como Entero
	
	Repetir
		Escribir 'Dame las notas'
		Leer nota
		suma=suma+nota
		
		Si nota>=max Entonces
			max=nota
		FinSi
		
		Si nota<=min Entonces
			min=nota
		FinSi
		
		Si nota<0 Entonces
			contador=30
			suma=suma-nota
		FinSi
		
		contador=contador+1
	Hasta Que contador>=30
	
	Escribir suma
	Escribir max
	Escribir min
FinAlgoritmo