class EstructurasControl{
	public static void main(String[] argumentos){
		/* for (int i = 0; i < argumentos.length;i++){
			System.out.println("Arg " + i);
			System.out.println("Arg " + argumentos[i]);
		}*/
		
		int i = 0;
		while(i < argumentos.length){
			System.out.println("Arg " + i);
			//if(i < 3) continue; pasa a la siguiente condicion
			System.out.println("Arg " + argumentos[i]);
			//break salta y rompe la ejecucion
			i++;
		}
		
		i = 0;
		for ( ;i < argumentos.length; ){
			System.out.println("Arg " + i);
			System.out.println("Arg " + argumentos[i]);
			i++;
		}
		
		/* Bucle infinito
			for ( ; ; ){ 
				System.out.println("Arg " + i);
				System.out.println("Arg " + argumentos[i]);
				i++;
			}
		*/
		
		do{
			System.out.println("Siempre se muestra");
		}while(false);
		
		boolean siEjecutar = (5 > 3) || (20 == 20); // (5 < 3) && (20 == 20)
		
		if(siEjecutar){
			System.out.println("La condicion es true");
		}else if(5 == 3){
			System.out.println("La condicion es rara");			
		}else if(8 == 3){
			System.out.println("La condicion es rara");			
		}else{
			System.out.println("La condicion es false");
		}
		
		int valor = 1;
		switch(valor){
			case 0:
				System.out.println("Valor cero");
				break;
			case 1:
				System.out.println("Valor uno");
				break;
			case 2:
				System.out.println("Valor dos");
				break;
			case 3:
				System.out.println("Valor tres");
				break;
			default:
				System.out.println("Otro valor");
				break;
		}
		
		String valor1 = "3";
		switch(valor1){
			case "0":
				System.out.println("Valor cero");
				break;
			case "1":
				System.out.println("Valor uno");
				break;
			case "2":
			case "3":
				System.out.println("Valor dos o tres");
				break;
			default:
				System.out.println("Otro valor");
				break;
		}
	}
}