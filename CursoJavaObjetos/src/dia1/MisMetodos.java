package dia1;

public class MisMetodos {

	//Método que devuelve la suma de dos números enteros
	
	public static int sumaDosNumeros(int x1,int x2) {
		return x1 + x2;
	}
	
	public static boolean isPrimo(int numero) {
		boolean primo = true;
		
		for(int i = 2;i<numero;i++) {
			if(numero%i==0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
	
	//Métod que devuelve la posición de un número en una matriz
	// sino lo encuentra devuelve -1
	public static int getPosicionInMatriz(int matriz[],int valor) {
		int posicion = -1;
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==valor) {
				/*posicion =  i;
				break;
				*/
				
				return i;
			}
			
		}
		
		return posicion;
	}
	
	
	public static int resetear(int x) {
		x = 0;
		return x;
	}
	//Metodo/Función que resetea una matriz
	public static void resetear(int pepe[]) {
		
		for(int i = 0;i<pepe.length;i++) {
			pepe[i] = 0;
		}
	}
	
	//Método que recibe una matriz y lo muestra por consola
	public static void mostrarMatriz(int matriz[]) {
		for(int numero:matriz) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}
	
	
	
	
}
