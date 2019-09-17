/**
 * Clase de introduccion
 * @author Ainoa S D
 */
class HolaMundo {
	/**
	 * Metodos de inicio de programa
	 */
	 public static void main(String[] args){
		 System.out.println("Hola Mundo!"); 
		 
		 String nombre = "Ainoa";
		 System.out.println("Hola " + nombre + "!");
		 
		 byte unByte = -128; //desde -128 hasta 127
		 System.out.println("Byte: " + unByte);
		 
		 int entero = 1234567890;
		 System.out.println("Entero: " + entero);
		 
		 float decimalFloat = 12345678901f;
		 System.out.println("Decimal: " + decimalFloat);
		 
		 double decimalDoble = 1.234567890123456789;
		 System.out.println("Double: " + decimalDoble);
		 //{
		 long entLargo = 1234567890123456789L;   // Trillones
		 //}
		 System.out.println("Entero Largo: " + entLargo);
		 
		 char caracter = 110;  // 'z'
		 System.out.println("Caracter: " + caracter);
		 { //Bloque instruccion
			 char[] texto = {'a','b','c'};
			 System.out.println("Array: " + texto[1]);
		 
			 for (int i = 0; i < texto.length; i = i + 1){
				 System.out.println("Caracter: " + texto[i]);
			 }
		 }

	 }
}