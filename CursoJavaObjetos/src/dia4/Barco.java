package dia4;

public class Barco extends Vehiculo {

	private float eslora;
	private float manga;
	
	public Barco() {
		super();
	}
	public Barco(String matricula,float peso,float velMax,float eslora,float manga) {
		//Llamada al constructor de la clase base,debe ser
		//obligatoriamente la primera linea del constructor.
		super(matricula,peso,velMax);
		this.eslora = eslora;		
		
		this.manga = manga;
		
	}
	public float getEslora() {
		return eslora;
	}
	public void setEslora(float eslora) {
		this.eslora = eslora;
	}
	public float getManga() {
		return manga;
	}
	public void setManga(float manga) {
		this.manga = manga;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Eslora: " + eslora + " Manga: " + manga;
	}
	
}
