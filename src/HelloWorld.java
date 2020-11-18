
public class HelloWorld {	// classe principal, com a main, que executará as Java threads

	public static void main(String[] args) throws InterruptedException {
		
		PrintaHelloWorld tarefa = new PrintaHelloWorld();
		
		Thread thread1 = new Thread(new ThreadHelloWorld(tarefa), "tarefa1");	/* instancia a thread, cada thread recebe uma tarefa (um Runnable) e um parâmetro
		opcional, que é o nome que queremos utilizar para identificar a thread */
		Thread thread2 = new Thread(new ThreadHelloWorld(tarefa), "tarefa2");
		Thread thread3 = new Thread(new ThreadHelloWorld(tarefa), "tarefa3");
		Thread thread4 = new Thread(new ThreadHelloWorld(tarefa), "tarefa4");
		Thread thread5 = new Thread(new ThreadHelloWorld(tarefa), "tarefa5");
		Thread thread6 = new Thread(new ThreadHelloWorld(tarefa), "tarefa6");
		Thread thread7 = new Thread(new ThreadHelloWorld(tarefa), "tarefa7");
		Thread thread8 = new Thread(new ThreadHelloWorld(tarefa), "tarefa8");
		Thread thread9 = new Thread(new ThreadHelloWorld(tarefa), "tarefa9");
		Thread thread10 = new Thread(new ThreadHelloWorld(tarefa), "tarefa10");

		thread1.start();	// com o método start(), começa a thread
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		Thread.sleep(1000);	// método da sleep() dá uma pausa de 1 segundo.
		
		System.out.println("Status da " + thread1.getName() + " está: " + thread1.getState());	// pega o nome e o status da thread
		System.out.println("Status da " + thread2.getName() + " está: " + thread2.getState());
		System.out.println("Status da " + thread3.getName() + " está: " + thread3.getState());
		System.out.println("Status da " + thread4.getName() + " está: " + thread4.getState());
		System.out.println("Status da " + thread5.getName() + " está: " + thread5.getState());
		System.out.println("Status da " + thread6.getName() + " está: " + thread6.getState());
		System.out.println("Status da " + thread7.getName() + " está: " + thread7.getState());
		System.out.println("Status da " + thread8.getName() + " está: " + thread8.getState());
		System.out.println("Status da " + thread9.getName() + " está: " + thread9.getState());
		System.out.println("Status da " + thread10.getName() + " está: " + thread10.getState());
	}

}
