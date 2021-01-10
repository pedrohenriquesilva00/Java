
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Henrique da Silva";
		pedro.cpf = "77.777.777.77";
		pedro.profissao = "Programador";
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(100);
		
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro.titular.nome);
	}
}
