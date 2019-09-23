    let result = document.getElementById("resultado");
            
    function pulsado(valor) {
        if (valor ==="-")
            result.value = - (parseFloat(result.value));
	    else 
            result.value += valor;
    }