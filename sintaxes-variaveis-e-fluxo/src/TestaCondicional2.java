public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado � " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		} else {
			System.out.println("Voc� n�o pode entrar.");
		}
	}
}
