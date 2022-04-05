package dia4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una lista de vehiculos
		ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
		//Guardar vehiculos
		flota.add(new Vehiculo("1234GHJ",345,220));
		flota.add(new Vehiculo("8765OPE",456,160));
		flota.add(new Vehiculo("3451KIU",400,230));
		
		//Los objetos se les asigna un �ndice
		//Como recuperamos un veh�culo
		Vehiculo v1 = flota.get(0);
		
		//Buscar un Veh�culo a partir de la matr�cula
		Scanner lector = new Scanner(System.in);
		System.out.println("Intro matr�cula que desea buscar:");
		String matricula = lector.nextLine();
		
		//Utilizo un for mejorado para recorrer la lista de vehiculos
		
		for(Vehiculo v : flota) {
			if(v.getMatricula().equals(matricula)) {
				System.out.println("Datos veh�culo : " + v.toString());
				break;
			}
		}
		
		//Eliminar un veh�culo
		flota.remove(0);
		flota.remove(0);
		//Volver a mostrar la colecci�n con for normal
		System.out.println("Flota despu�s de eliminar veh�culo cero:");
		for(int i = 0;i<flota.size();i++) {
			System.out.println(flota.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
