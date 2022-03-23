package dia3;

public class GestorRestaurantes {

	private Restaurante rs[];
	
	public GestorRestaurantes(int tamanho) {
		rs = new Restaurante[tamanho];
	}
	
	public  void guardarRestaurante(Restaurante r) {
		for(int i = 0;i<rs.length;i++) {
			if(rs[i]==null) {
				rs[i] = r;
				break;
			}
		}
	}
	
	public  void eliminarRestaurante(String nombre) {
		for(int i = 0;i<rs.length;i++) {
			if(rs[i].getNombre().equals(nombre)) {
				rs[i] = null;
				break;
			}
		}
	}

}
