/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
		int x = Integer.parseInt(args[0].toString());
		int y = 1;
		String dato = "";
		
			if (x >= 1){
				for(int z = 1; z <= x; z++){
					if(z !=x){
						dato = dato + z + "x";
					}else{
						dato = dato + z;
					}
					y = y * z; 
				}	
			System.out.println(  dato + " = " + y);
	
			}
   		/*System.out.println(args[0]);


   		System.out.println("el producto es: "+resultado);
	     		*/
   }

}