package dia1;

public class MisMetodosPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Probando el m�todo sumaDosNumeros:
		int resultado = MisMetodos.sumaDosNumeros(12, 34);
		int a=9,b=12;
		
		
		resultado = MisMetodos.sumaDosNumeros(a, b);
		
		//Probando el m�todo getPosicion
		int matriz[] = {1,2,3,4,5};
		int posicion = MisMetodos.getPosicionInMatriz(matriz, 3);
		
		if(posicion == -1) {
			System.out.println("No se encontr� el valor en la matriz");
		}
		else {
			System.out.println("Est� en la posicion: " + posicion);
		}
		
		//Probar m�todo mostrar matriz
		MisMetodos.mostrarMatriz(matriz);
		MisMetodos.resetear(matriz);
		MisMetodos.mostrarMatriz(matriz);
		
		int numero = 9;
		numero = MisMetodos.resetear(numero);
		System.out.println("Numero: " + numero);
		
	}

}
