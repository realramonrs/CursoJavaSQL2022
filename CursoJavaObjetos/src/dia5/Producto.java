package dia5;

public abstract class Producto implements Descuentable,Comparable<Producto> {

	private String codigo;
	private String marca;
	private float precio;
	
	
	public Producto(String codigo, String marca, float precio) {
		
		this.codigo = codigo;
		this.marca = marca;
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		Float f = Float.valueOf(precio);
		return f.compareTo(o.precio);
	}
	@Override
	public void aplicarDescuento() {
		// TODO Auto-generated method stub
		
	}
	
	
	
		
	
}
