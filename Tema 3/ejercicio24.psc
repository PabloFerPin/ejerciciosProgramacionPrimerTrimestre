Algoritmo ejercicio24
	Definir base,altura,area Como Real
	
	Escribir 'Dame la base y la ultura del triangulo para calacular el area'
	Escribir 'Base ' Sin Saltar
	Leer base
	Escribir 'Altura ' Sin Saltar
	leer altura
	
	area=calculadoraDeAreas(base,altura)
	
	Escribir 'El area de su triangulo es: ' area
FinAlgoritmo

Funcion varArea=calculadoraDeAreas(varBase,varAltura)
	varArea=(varBase*varAltura)/2
FinFuncion	