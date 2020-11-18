
public class ThreadHelloWorld implements Runnable {	// classe que representa uma thread de fato, implementa um Runnable, que possui o método run()

	private PrintaHelloWorld print;	// atributo print do tipo PrintHelloWorld, que implementa a função que cada thread executará com o método run()
	
	public ThreadHelloWorld(PrintaHelloWorld print) {
		this.print = print;
	}

	@Override
	public void run() {		// quando a thread começar (derem um start() nela) esse é o código que irá rodar
		print.printa();
	}
	
}
