package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
@Test
public void testCase() {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("ex2/appctx.xml");
	
	MessageRouter router =(MessageRouter)ctx.getBean("router");
	
	router.processMessage("sms", "122334", "Hello Nilya");
	router.processMessage("email", "nilya.surya@email.com", "Kayre Nilya");
	router.processMessage("tweet", "@imnilya", "Kayre Nilya");
}
}
