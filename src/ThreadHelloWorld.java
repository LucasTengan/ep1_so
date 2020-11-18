
public class ThreadHelloWorld implements Runnable {	// classe que representa uma thread de fato, implementa um Runnable, que possui o m�todo run()

	private PrintaHelloWorld print;	// atributo print do tipo PrintHelloWorld, que implementa a fun��o que cada thread executar� com o m�todo run()
	
	public ThreadHelloWorld(PrintaHelloWorld print) {
		this.print = print;
	}

	@Override
	public void run() {		// quando a thread come�ar (derem um start() nela) esse � o c�digo que ir� rodar
		print.printa();
	}
	
}
