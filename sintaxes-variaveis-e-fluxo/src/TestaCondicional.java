public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Seja Bem Vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você pode entrar,"
						+ "pois está acompanhado.");
			} else {
				System.out.println("Você não pode entrar.");
			}
		}
	}
}
