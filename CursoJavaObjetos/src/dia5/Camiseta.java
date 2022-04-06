package dia5;

public class Camiseta extends Producto {

	private String talla;

	public Camiseta(String codigo, String marca, float precio, String talla) {
		super(codigo, marca, precio);
		this.talla = talla;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Camiseta [talla=" + talla + " " + super.toString() + "]";
	}
	
	public void aplicarDescuento() {
		//Si la ram = 16, aplicar 10% de descuento
		if(this.talla.equals("XL")) {
			this.setPrecio(this.getPrecio()*0.9f);
		}
		else if(this.talla.equals("L")) {
			this.setPrecio(this.getPrecio()*0.8f);
		}
		else {
			this.setPrecio(this.getPrecio()*0.7f);
		}
}
}
