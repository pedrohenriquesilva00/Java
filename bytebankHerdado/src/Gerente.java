
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonificacao do GERENTE");
		return super.getSalario();
	}
}
