/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
		int numero = Integer.parseInt(args[0].toString());
		int num = numero%2;      	
      	
			if (num == 0){
			System.out.println("numero es par");
			}
		else{ System.out.println("numero es impar");
			}
   		

		/*// si el numero es impar
   			System.out.println("numero es impar");

   		// si el numero es par
   			System.out.println("numero es par");*/

   }
}