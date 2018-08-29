package ex3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {
	@Test
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex3/appctx.xml");
		
		ResourceProvider rp1 = (ResourceProvider)ctx.getBean("provider");
		ResourceProvider rp2 = (ResourceProvider)ctx.getBean("provider");
		
		System.out.println(rp1 == rp2);
	}
}
