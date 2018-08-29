package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class HelloWorld {

	private String name;
	
	
	public HelloWorld() {
		System.out.println("Default constructor");
	}

	public HelloWorld(String name) {
		
		this.setName(name);
	System.out.println("Param constructor");
	}

	public String getName() {
		return name;
	}
	@Value("Annotated Nilya")
	public void setName(String name) {
		this.name = name;
	}

	

}
