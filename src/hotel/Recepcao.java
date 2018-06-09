 package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	private int qntHospedes;
	private double lucroTotal;
	private Estadia estadia;
	
	public Recepcao() {
		this.estadias = new ArrayList<>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		estadia = new Estadia(nome, tipo, idade, dias, valor);
		this.estadias.add(estadia);
		this.qntHospedes += 1;
		this.lucroTotal += valor;
	}
	
	public void checkOut(String nome) {
		for (Estadia hospede : this.estadias) {
			if (hospede.getNome().equals(nome));
			this.estadias.remove(hospede);
		}
		this.qntHospedes -= 1;
	}
	
	public int getNumDeHospedes() {
		return this.qntHospedes;
	}
	
	public double getLucroTotal() {
		return this.lucroTotal;
	}
	
	public String toString() {
		String listaHospedes = "";
		for (Estadia estadia : this.estadias) {
			listaHospedes += estadia.toString() + System.lineSeparator();
		}
		return listaHospedes;
	}
}
