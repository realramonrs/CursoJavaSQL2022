package dia5;

public class Crucero extends Viaje {

	private String piscina;

	public Crucero(String destino, float precio, String piscina) {
		super(destino, precio);
		this.piscina = piscina;
	}

	public String getPiscina() {
		return piscina;
	}

	public void setPiscina(String piscina) {
		this.piscina = piscina;
	}

	@Override
	public String toString() {
		return "Crucero [piscina=" + piscina + "]";
	}
	
	
}
