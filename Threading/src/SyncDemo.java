
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		display(name);
	}
	private Object dummy=new Object();
	private synchronized void display(String name) {
		System.out.println("Thread entered");
		synchronized(dummy) {
			System.out.print("[");
			try {
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		System.out.println("Thread exited");
		
	}
	
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Bravo");
		Thread t3 = new Thread(sd, "Charlie");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
