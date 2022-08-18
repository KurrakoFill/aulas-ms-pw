package br.edu.cpti.teste;

import java.io.ObjectInputStream.GetField;

import br.edu.cpti.model.Caminhao;
import br.edu.cpti.model.VeiculoPasseio;

public class TesteVeiculo {

	public static void main(String[] args) {

		Caminhao c1 = new Caminhao();
		c1.setPlaca("KLI-0909");
		c1.setChassi("231231252");
		c1.setCargaMaxima(10500.);
		c1.setValor(55000);
		System.out.println("IPVA CAMINHÃO: "+ c1.calcularIPVA());

		VeiculoPasseio v1 = new VeiculoPasseio();
		v1.setPlaca("HYU-0303");
		v1.setChassi("2525253636");
		v1.setQuantidadePorta(4);
		v1.setValor(15000);
		System.out.println("Placa Veiculo: " +v1.getPlaca());
		System.out.println("IPVA Veicuo de Passeio: "+ v1.calcularIPVA());
		
		
		
	}

}
