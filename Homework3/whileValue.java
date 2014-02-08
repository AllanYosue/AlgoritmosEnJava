/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int numero = Integer.parseInt(args[0].toString());;
		String dato = "";
		if(numero > 0){
				for(int x = 0; x < numero; x++){
					dato = dato + "el valor actual es: " + x + "\n";
				}
				System.out.println("\n" + dato);
			}
   		/*System.out.println(args[0]);
*/
   		/*/si valor actual < args[0]
   			System.out.println("el valor actual es: "+valorActual);
      */
   }

}