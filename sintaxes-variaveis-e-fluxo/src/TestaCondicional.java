public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Seja Bem Vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� pode entrar,"
						+ "pois est� acompanhado.");
			} else {
				System.out.println("Voc� n�o pode entrar.");
			}
		}
	}
}
