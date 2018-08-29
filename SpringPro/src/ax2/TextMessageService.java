package ax2;

import org.springframework.stereotype.Component;

@Component("sms")
public class TextMessageService implements MessageService {

	
	public TextMessageService() {
		System.out.println("text service constrcutor");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("SMS sent to:" + to + "with " + msg);
	}

}
