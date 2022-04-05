package dia4;

public class Vehiculo {

	private String matricula;
	private float peso;
	private float velocidadMaxima;
	
		
	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, float peso, float velocidadMaxima) {
		
		this.matricula = matricula;
		this.peso = peso;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return matricula + " " + peso + " " + velocidadMaxima;
	}
	
	
	
	
	
	
	
	
}
