package br.edu.cpti.model;

public class Caminhao extends Veiculo {

	private double cargaMaxima;

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public double calcularIPVA() {
		// TODO Auto-generated method stub
		return super.calcularIPVA() *2;
	}

}
