package dia5;

public class Viaje {

	private String destino;
	private float precio;
	public Viaje(String destino, float precio) {
		super();
		this.destino = destino;
		this.precio = precio;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Viaje [destino=" + destino + ", precio=" + precio + "]";
	}
	
	
	
}
