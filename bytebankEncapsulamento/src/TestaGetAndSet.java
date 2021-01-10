
public class TestaGetAndSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(333, 212324);
		
		System.out.println("O n�mero da sua conta �: " + conta.getNumero());
		
		Cliente pedro = new Cliente();
		conta.setTitular(pedro);
		
		pedro.setNome("Pedro Henrique");
		
		System.out.println("O nome do titular da conta �: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println("A profiss�o do titular �: " + conta.getTitular().getProfissao());
	}
}
