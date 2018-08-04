
public class MyRunnable implements Runnable {
	private int data;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=1;c<=5;c++) {
			System.out.println(name+ " "+ ++data);
		}
		
	}
public static void main(String[] args) {
	MyRunnable mr = new MyRunnable();
	
	Thread t1 = new Thread(mr,"Audi");
	Thread t2 = new Thread(mr,"Mitsubishi");
	Thread t3 = new Thread(mr,"Lamborgini");
	t1.start();
	t2.start();
	t3.start();
}
}
