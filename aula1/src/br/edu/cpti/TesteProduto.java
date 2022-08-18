package br.edu.cpti;

public class TesteProduto {

	public static void main(String[] args) {
								//Contrutor
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		new Produto();
		Produto produto3 = new Produto(1, "Abacaxi",5.90);
		Produto produto4 = new Produto(2, "Melancia",30.0);
		Produto produto5 = new Produto(3, "Abacate",6.0);
		
		//Trocar descricao e valor usa :
		produto3.setValor(7.0); 
		produto3.setDescricao("Abacaxi de Marataises");
		
		System.out.println(produto3.getCodigo() + " "
				+ produto3.getDescricao() + " " + produto3.getValor());
		
		System.out.println("Total Geral de Produtos:" + Produto.getTotalProdutos());
		

	}

}
