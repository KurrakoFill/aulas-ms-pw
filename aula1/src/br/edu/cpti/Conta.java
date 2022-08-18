package br.edu.cpti;

public class Conta {
	//Padrão CamelCase
	//
	 private String numeroConta;
	 private Double saldo;
	 //Entrada de daos via set <Nome do Atributo>
	 
	public void setNumeroConta(String numeroConta) {
		//this - atributo
		this.numeroConta = numeroConta;
	}
	
	//Leitura de dados via get <Nome do Atributo>
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos sem retorno tdo metodo tem que ser : publico
	
	public void deposito (Double valor) {
		saldo += valor ; 
		
		}
	public String getNumeroConta() {
		return numeroConta;
	}
	
	//Método com retorno
	public String saque(Double valor) {
		if(saldo < valor) {
			return"Saldo insuficiente !";
		} else {
			saldo -= valor;
			return "Saldo efetuado com sucesso !";
		}
	}

}
