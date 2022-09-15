
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");

		int idade = 20;
		boolean estaAcompanhado = true;
		int idadePessoa2 = 10;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} else if (estaAcompanhado) {
			if (idadePessoa2 >= 18) {
				System.out.println("Você é menor de idade, mas seu acompanhante é maior!");
			} else {
				System.out.println("Todos vocês são menores de idade!");
			}
		} else {
			System.out.println("Você é menor de idade e não esta acompanhado!");
		}
	}
}
