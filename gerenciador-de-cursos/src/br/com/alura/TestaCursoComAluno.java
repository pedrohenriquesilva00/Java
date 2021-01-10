package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		// Cria uma referência do tipo Curso
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		// Adiciona aulas direto do construtor
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		// Cria novos alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maurício Aniche", 17645);
		
		// Adiciona os alunos no Curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		// Percorre o conjunto e imprime os nomes dos alunos
		System.out.println("Todos os alunos matriculados");
		
		// Código legado
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		Iterator<Aluno> iterador = alunos.iterator();
//
//		while (iterador.hasNext()) {
//		    System.out.println(iterador.next());
//		}
		
		// forEach Java 8
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		// Tornando referências iguais
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		System.out.println("O a1 é equals ao Turini?");
		// Retorna verdadeiro
		System.out.println(a1.equals(turini));
		
	}
}
