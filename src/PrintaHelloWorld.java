
public class PrintaHelloWorld {	// classe que estabele o que cada thread executar� como fun��o
	
	public void printa() {
		String nome_tarefa = Thread.currentThread().getName();		// pega o nome da tarefa da thread que est� rodando
		System.out.println("Hello World da " + nome_tarefa);		// printa Hello World com o nome da thread que est� rodando
	}
}
