
public class PrintaHelloWorld {	// classe que estabele o que cada thread executará como função
	
	public void printa() {
		String nome_tarefa = Thread.currentThread().getName();		// pega o nome da tarefa da thread que está rodando
		System.out.println("Hello World da " + nome_tarefa);		// printa Hello World com o nome da thread que está rodando
	}
}
