
public class DaemonThread extends Thread {
	private int limit;

	public DaemonThread(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= limit; c++) {
			System.out.println(name + ":" + c);
		}
	}

	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread("Alpha", 10);
		DaemonThread t2 = new DaemonThread("Bravo", 25);
		DaemonThread t3 = new DaemonThread("Charlie", 75);
		DaemonThread t4 = new DaemonThread("Daemon", 500000);
		t4.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
