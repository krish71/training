package ex1;

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

	public void setName(String name) {
		this.name = name;
	}

	

}
