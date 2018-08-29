package ax1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	@Test
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotated.xml");
		
		HelloWorld hw = (HelloWorld)ctx.getBean("hi");
		System.out.println("Name: " + hw.getName());
	}
}
