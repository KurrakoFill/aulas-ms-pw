package br.edu.cpti.model;

import java.time.LocalDate;

//CTRL+SHIF+O - IMPORTAR
//CTRL+SHIFT+F - IDENTAR

public class Produto {

	private int codigo;
	private String descricao;
	private Double valor;
	private LocalDate dataCadastro;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(int codigo, String descricao, Double valor, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
