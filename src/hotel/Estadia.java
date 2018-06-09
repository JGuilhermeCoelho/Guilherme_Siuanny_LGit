package hotel;

public class Estadia {
	
	private Animal animal;
	private int dias;
	private double valor;

	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.dias = dias;
		this.valor = valor;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getNome() {
		return this.animal.getNome();
	}
	
	public String getTipo() {
		return this.animal.getTipo();
	}
	
	public int getIdade() {
		return this.animal.getIdade();
	}
	
	public String toString() {
		return this.animal.getNome() + ", " + this.animal.getTipo() + ", " + this.dias + " dias com o preço de R$ " + this.valor;
	}
}
