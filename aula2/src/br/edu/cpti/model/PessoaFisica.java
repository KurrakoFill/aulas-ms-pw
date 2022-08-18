package br.edu.cpti.model;

public class PessoaFisica extends ImpostoRenda {

	private String cpf;

	public PessoaFisica(String nome, double rendimentos, String cpf) {
		super(nome, rendimentos);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calcularImposto() {

		return this.rendimentos * 0.15;

	}

}
