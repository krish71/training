
public class Mythread extends Thread {
	private int data;

	public Mythread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= 5; c++) {
			System.out.println(name+ " " + ++data);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Mythread mt1 = new Mythread("Rolex");
		Mythread mt2 = new Mythread("Titan");
		Mythread mt3 = new Mythread("BMW");
		
		mt1.start();
//		Thread.sleep(5);
		mt2.start();
//		Thread.sleep(5);
		mt3.start();
		 
		String name = currentThread().getName();
		for (int c = 1; c <= 5; c++) {
			System.out.println(name+ " " + c);
		}

	}

}
