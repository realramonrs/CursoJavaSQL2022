package dia1;

public class AlumnoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno();
		a.dni = "12345678G";
		a.nombre = "Juan Gutierrez";
		a.email="juan@ciclosmontecastelo.com";
		
		System.out.println(a.dni + " " + a.nombre);
		System.out.println(a);
	}

}
