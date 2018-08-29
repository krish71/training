package ax4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	@Test
	public void lafda() {
		ConfigurableApplicationContext kuchBhi = new ClassPathXmlApplicationContext("annotated.xml");
		
		MyLife dukh = kuchBhi.getBean(MyLife.class);
		
		kuchBhi.close();
		
	}
}
