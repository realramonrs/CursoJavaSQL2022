package dia3;

public class PruebaRestaurante {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[10];
		Restaurante restaurantes[] = new Restaurante[10];
		Restaurante.setCentroComercial("Vialia");
		
		
		
		restaurantes[0] = new Restaurante("Thai Market",9);
		restaurantes[1] = new Restaurante("Taco Bell",8.5f);
		restaurantes[2] = new Restaurante("McDonalds",3);
		restaurantes[3] = new Restaurante("Foster's Hollywood",10);
		restaurantes[4] = new Restaurante("Lokal",11);
		//Modificar la valoracion de un restaurante:
		
		restaurantes[0].setValoracion(6);
		Restaurante.setCentroComercial("Plaza Elíptica");
		for(int i = 0;i<restaurantes.length;i++) {
			if(restaurantes[i]!=null) {
				System.out.println(restaurantes[i] + " " + Restaurante.getCentroComercial());
			}
			}
		
		//Guardar un restaurante en la primera posición vacía
		Restaurante r1 = new Restaurante("La Pepita",7);
		
		Restaurante.guardarRestaurante(restaurantes, r1);
		Restaurante.eliminarRestaurante(restaurantes, "Thai Market");
		
		//Mostrar la matriz resultante
		System.out.println("Restaurantes del centro comercial: " + Restaurante.getCentroComercial());
		
		for(Restaurante r : restaurantes) {
			System.out.println(r);
		}
		
	}

}
