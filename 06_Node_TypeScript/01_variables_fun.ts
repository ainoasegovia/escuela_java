//'usestrict';

// Ultimo codigo JS

var hola = "Hola";

console.log("Guay " + hola);

function otroHola(saludo){
	console.log("Guay " + saludo);
}

otroHola(" adios JS!");

// Type Script:

let variableNum: number;

// console.log(variableNoDeclarada);

variableNum  = 100;
// variableNum = "texto"; MAL en tipos
console.log(variableNum);

let miUnion: number | string | boolean;

// miUnion = new Object();
miUnion = true;
miUnion = "....";

interface Tiempo{
	dia: number;
	mes: number;
	anio: number;
};

let miCumple: Tiempo = {dia: 18, mes: 6, anio: 1995};

console.log("Mi cumple es el dia " + miCumple.dia + " del mes " + miCumple.mes + " del año " + miCumple.anio);

// any: tipo que dice que puede ser de cualquier tipo, un buen tipo
function concatenar(texto1: string, texto2: any){
	console.log("Concatenando: " + texto1 + texto2);
}

concatenar("Total, ","que recibe una cosa");
concatenar("u otra, " , miCumple);
//concatenar("u otra", 200);
