
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tage: " + age ;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
	

}
