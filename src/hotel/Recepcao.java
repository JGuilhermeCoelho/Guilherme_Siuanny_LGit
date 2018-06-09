 package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	private int qntHospedes;
	private double lucroTotal;
	
	public Recepcao() {
		this.estadias = new ArrayList<>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		this.estadias.add(estadia);
		this.qntHospedes += 1;
	}
	
	public void checkOut(String nome) {
		
		this.qntHospedes -= 1;
	}
	
	public int getNumDeHospedes() {
		return 0;
	}
	
	public double getLucroTotal() {
		return 0;
	}
	
	public String toString() {
		String listaHospedes = "";
		for (Estadia estadia : this.estadias) {
			listaHospedes += estadia.toString() + System.lineSeparator();
		}
		return listaHospedes;
	}
}
