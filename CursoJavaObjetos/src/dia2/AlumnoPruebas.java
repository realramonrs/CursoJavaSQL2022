package dia2;

public class AlumnoPruebas {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ejemplo = "Hola";
		String ejemplo2 = new String("Hola");
		
		//Declarar variables de tipo Alumno
		Alumno a1,a2,a3;
		Alumno clase1[] = new Alumno[25];
		//Instanciar un alumno
		a1 = new Alumno();
		try {
			a2 = new Alumno("Pepe","21afe",34);
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		a1.setNombre("Ricardo");
		a1.setEdad(23);
		
		try {
			a1.setDni("1hffhgffhg2345678R");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		a1.calcularMedia();
		
		
		
		
		
		System.out.println(a1.getNombre() + " " + a1.getDni() + " " + a1.getEdad() + " años " + a1.getMedia());
		
		//a2 no apunta a ningún objeto Alumno
		a2 = new Alumno();
		a2.setNombre("Alejandro");
		
		//Ver primera nota del alumno a1:
		float nota1 = a1.getNotas()[0];
		
		
		
		
		
	}

}
