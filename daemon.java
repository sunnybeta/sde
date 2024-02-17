public class Main {
	public static void main(String[] args) {
		Daemon thread1 = new Daemon("thread1");
		Daemon thread2 = new Daemon("thread2");
		Daemon thread3 = new Daemon("thread3");

		thread1.setDaemon(true);

		thread1.start();
		thread2.start();

		thread3.setDaemon(true);
		thread3.start();
	}
}

public class Daemon extends Thread {
	public Daemon(String name) {
		super(name);
	}

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon Thread");
		} else {
			System.out.println(getName() + " is not Daemon Thread");
		}
	}
}
