package ex2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageRouter implements ApplicationContextAware {
	private ApplicationContext appCtx;

	@Override
	public void setApplicationContext(ApplicationContext appCtx) throws BeansException {
		this.appCtx = appCtx;
	}
	
	public void processMessage(String type, String to, String msg) {
		MessageService service =(MessageService)appCtx.getBean(type);
		service.send(to, msg);
	}
}
