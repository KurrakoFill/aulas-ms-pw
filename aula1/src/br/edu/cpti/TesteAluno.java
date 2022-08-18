package br.edu.cpti;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String cor = "Verde";
		//String cor = new String(Verde);
		Aluno aluno1=new Aluno ();
		aluno1.nome = "Joaquim";
		aluno1.telefone = "2245-1090";
		aluno1.email = "joaquim@gmail.com";
			System.out.println("Dados do aluno: "+aluno1.nome);
			System.out.println("Telefone do aluno: "+aluno1.telefone);
			System.out.println("email do aluno: "+aluno1.email);
			
			
			Aluno aluno2=new Aluno();
			Aluno aluno3=new Aluno();
			Aluno aluno4=aluno3;
			
			System.out.println(aluno2);
			System.out.println(aluno3);
			
			if(aluno2 == aluno3) {
				System.out.println("São iguais");
			}else {
				System.out.println("Diferentes");
			}
		

	}

}
