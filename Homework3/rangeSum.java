/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

		
	int numero1 = Integer.parseInt(args[0].toString());
	int numero2 = Integer.parseInt(args[1].toString());
	String var = "";
	if(numero1 > numero2){
		if(numero1 != numero2-1){
			for( int x = numero2 + 1; x<numero1; x++){
				if(x != numero1 -1){
					var = var + x + ",";
				}else{
					var = var + x;
				}
			}
			System.out.println( var);
		}
	}else if(numero2>numero1){
		if(numero2 != numero1+1){
			for( int x = numero1 + 1; x < numero2; x++){
				if(x != numero2 -1){
					var = var + x + ",";
				}else{
					var = var + x;
				}
			}
      		System.out.println( var);
		}
	}

         /*System.out.println("numero actual es:" );
      */
   }
}