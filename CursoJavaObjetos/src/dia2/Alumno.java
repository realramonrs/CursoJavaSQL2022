package dia2;

public class Alumno {

	private String nombre;
	private String dni;
	private int edad;
	private double media;
	private float notas[];
	
	//Constructores --> Sirven para inicializar los atributos
	//de los objetos de la clase
	
	public Alumno() {
		edad = 0;
		media = 0;
		notas = new float[5];
	}
	
	public Alumno(String nombre,String dni,int edad) throws Exception {
		this.nombre = nombre;
		setDni(dni);
		this.edad = edad;
		notas = new float[5];
	}
	
	
	
	//Método de acceso --> leer el nombre
	public String getNombre() {
		return nombre;
	}
	//Método de acceso --> escribir el nombre
	public void setNombre(String nom) {
		nombre = nom;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) throws Exception {
		if(dni.length()==9) {
			this.dni = dni;
		}
		else {
			throw new Exception("Error en el dni");
		}
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	//Método de acceso --> leer la media de un alumno
	public double getMedia() {
		return media;
	}
	
	
	//Métodos de la clase Alumno
	public void calcularMedia() {
		float suma = 0;
		for(int i = 0;i<notas.length;i++) {
			suma = suma + notas[i];
		}
		media = suma / notas.length;
	}
	
	
	
	
	
}
