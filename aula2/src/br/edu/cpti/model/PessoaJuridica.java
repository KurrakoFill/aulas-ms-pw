package br.edu.cpti.model;

public class PessoaJuridica extends ImpostoRenda {

	private String cnpj;

	public PessoaJuridica(String nome, double rendimentos, String cnpj) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
