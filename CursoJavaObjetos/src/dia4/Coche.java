package dia4;

public class Coche extends Vehiculo {

	private boolean turbo;
	
	public Coche() {
		super();
	}
	
	public Coche(String matricula,float peso,float velMax,boolean turbo) {
		super(matricula,peso,velMax);
		this.turbo = turbo;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " turbo : " + turbo;
	}
	
	
	
}
