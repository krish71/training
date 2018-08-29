package ax2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("tweet")
@Lazy
public class TwitterMessageService implements MessageService {
	
	public TwitterMessageService() {
		System.out.println("Twitter message service constructor");
		
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("Name: " + to + "with " + msg);
	}
}
