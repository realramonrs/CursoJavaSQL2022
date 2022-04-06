package dia5;

public class Ordenador extends Producto {

	private float capacidad;
	private float ram;
	public Ordenador(String codigo, String marca, float precio, float capacidad, float ram) {
		super(codigo, marca, precio);
		this.capacidad = capacidad;
		this.ram = ram;
	}
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	public float getRam() {
		return ram;
	}
	public void setRam(float ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Ordenador [capacidad=" + capacidad + ", ram=" + ram + ", " + super.toString() + "]";
	}	
	
	public void aplicarDescuento() {
		//Si la ram = 16, aplicar 10% de descuento
		if(this.ram == 16) {
			this.setPrecio(this.getPrecio()*0.9f);
		}
		else if(this.ram==8) {
			this.setPrecio(this.getPrecio()*0.8f);
		}
		else {
			this.setPrecio(this.getPrecio()*0.7f);
		}
	}
	
	
	
	
}
