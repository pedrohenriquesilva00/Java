
public class TestaGetAndSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(333, 212324);
		
		System.out.println("O número da sua conta é: " + conta.getNumero());
		
		Cliente pedro = new Cliente();
		conta.setTitular(pedro);
		
		pedro.setNome("Pedro Henrique");
		
		System.out.println("O nome do titular da conta é: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println("A profissão do titular é: " + conta.getTitular().getProfissao());
	}
}
