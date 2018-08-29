package ex2;

public class TwitterMessageService implements MessageService {
	
	public TwitterMessageService() {
		System.out.println("Twitter message service constructor");
		
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("Name: " + to + "with " + msg);
	}
}
