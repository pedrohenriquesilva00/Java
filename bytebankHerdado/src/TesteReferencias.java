
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Pedro");
		g1.setSalario(5000.0);
		System.out.println(g1.getBonificacao());
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(5000.0);
		System.out.println(ev.getBonificacao());
		
		Designer d = new Designer();
		d.setSalario(5000.0);
		System.out.println(d.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
