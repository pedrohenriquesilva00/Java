
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");

		int quantidadePessoas = 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
	}
}
