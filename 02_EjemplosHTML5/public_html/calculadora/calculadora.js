class Calculadora {
	
	constructor(){
		this.result = document.getElementById("resultado");
	};
	
	numeroPulsado(evenObj){ // Funcion añadida como metodo
		let valor = evenObj.currentTarget.innerHTML;
		//alert("Pulsado: " + valor);
		if (valor === "+/-"){
			this.result.value = "" + (- (parseFloat(this.result.value)));
		}else if(valor === "."){
			if( ! calculadora.result.value.includes("."))
				this.result.value += valor;
		}else{
			this.result.value += valor;
		}
	};

};

let calculadora = null;

window.onload= function(){
	let botones = document.getElementsByClassName("num"); // Obtener todos los elementos cuya clase sea "num", devuelve array
	calculadora = new Calculadora();
	
	for(let boton of botones){
		boton.addEventListener("click",(evtObj) => {
			calculadora.numeroPulsado(evtObj);
		});
	}
};

/*calculadora.numeroPulsado = function(valor) { // Funcion añadida como metodo
    if (valor === "-")
        result.value = - (parseFloat(result.value));
	else 
        result.value += valor;
}*/