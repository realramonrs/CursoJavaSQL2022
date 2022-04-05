package dia4;

import java.util.ArrayList;

public class TestHerencia {

	public static void acelerar(Vehiculo v,float velocidad) {
		v.setVelocidadMaxima(v.getVelocidadMaxima()+ velocidad);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
		
		flota.add(new Barco("1234JHK",6000,450,250,150));
		flota.add(new Coche("5362FGT",2500,220,false));
		flota.add(new Moto());
		flota.add(new Nave());
		
		
		acelerar(flota.get(0),10);
		acelerar(flota.get(1),20);
		
		//Mostrar info de toda la flota
		for(Vehiculo v : flota) {
			System.out.println(v.toString());
		}
		
		
		
		
		
		
		
		
	}

}
