
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(333, 212324);
		System.out.println("N�mero da Ag�ncia: " + conta.getAgencia());
		
		Conta conta2 = new Conta(112, 212345);
		System.out.println("N�mero da Ag�ncia: " + conta2.getAgencia());
		
		Conta conta3 = new Conta(212, 221343);
		System.out.println("N�mero da Ag�ncia: " + conta3.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
