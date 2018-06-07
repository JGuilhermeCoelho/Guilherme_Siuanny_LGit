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
	
}
