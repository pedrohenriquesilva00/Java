
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo = 150;
		
		contaDoPedro.deposita(50);	
		System.out.println(contaDoPedro.saldo);
	
		boolean retirouDinheiro = contaDoPedro.saca(100);
		System.out.println(contaDoPedro.saldo);
		System.out.println(retirouDinheiro);
		
		System.out.println(contaDoPedro.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPedro);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com Sucesso!");
		} else {
			System.out.println("Dinheiro Insuficiente.");
		}
		
		System.out.println("Marcela, novo saldo de: " + contaDaMarcela.saldo + " Reais");
		System.out.println("Pedro, novo saldo de: " + contaDoPedro.saldo + " Reais");
		
		
	}
}
