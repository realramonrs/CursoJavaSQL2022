package dia1;

public class Ejemplo1Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 7;
		
		//Un numero es primo cuando sólo es divisible entre 1 
		// y el propio numero
		boolean primo = MisMetodos.isPrimo(numero);
		
		if(primo) {
			System.out.println("número primo.");
		}
		else {
			System.out.println("número no primo.");
		}
		
		int matriz[] = {56,11,34,23,13,17,84};
		int contadorPrimos = 0;
		//Contar números primos en una matriz
		boolean primo2 = true;
		for(int i = 0;i<matriz.length;i++) {
			primo2 = MisMetodos.isPrimo(matriz[i]);
			
			if(primo2) {
				contadorPrimos++;
			}
			
		}//Llave que cierra el bucle exterior
		
		System.out.println("Primos: " + contadorPrimos);
	}

}
