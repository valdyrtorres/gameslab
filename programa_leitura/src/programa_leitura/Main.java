package programa_leitura;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome, idade, peso, cidade, estado, pais;
		System.out.println("Por favor digite o seu nome:");
		nome = in.nextLine();
		System.out.println("Por favor digite a sua idade:");
		idade = in.nextLine();
		System.out.println("Por favor digite o seu peso:");
		peso = in.nextLine();
		System.out.println("Por favor digite a sua cidade:");
		cidade = in.nextLine();
		
		if(cidade.equals("Floripa")) {
			System.out.println("Show! Sou de Floripa também");
		} else {
			System.out.println("Que pena, você não é de Floripa :/");
		}
		
		System.out.println("Por favor digite o seu estado:");
		estado = in.nextLine();
		System.out.println("Por favor digite o seu pais:");
		pais = in.nextLine();
		// Gerar resultado final:
		System.out.println("-------------");
		System.out.println("Aqui está o resultado do teste:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("Pais: " + pais);


	}
}
