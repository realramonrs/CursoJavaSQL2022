package dia3;

public class Restaurante extends Object {

	private String nombre;
	private float valoracion;
	private static String centroComercial;
	
	public Restaurante(String nombre) {
		this.nombre = nombre;
	}
	
	public Restaurante(String nombre,float valoracion) {
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValoracion() {
		return valoracion;
	}

	public void setValoracion(float valoracion) {
		this.valoracion = valoracion;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " Valoracion: " + Float.toString(valoracion); 
	}

	public static String getCentroComercial() {
		return centroComercial;
	}

	public static void setCentroComercial(String centroComercial) {
		Restaurante.centroComercial = centroComercial;
	}
	
	
	public static void guardarRestaurante(Restaurante []rs,Restaurante r) {
		for(int i = 0;i<rs.length;i++) {
			if(rs[i]==null) {
				rs[i] = r;
				break;
			}
		}
	}
	
	public static void eliminarRestaurante(Restaurante []rs,String nombre) {
		for(int i = 0;i<rs.length;i++) {
			if(rs[i].getNombre().equals(nombre)) {
				rs[i] = null;
				break;
			}
		}
	}

	
}
