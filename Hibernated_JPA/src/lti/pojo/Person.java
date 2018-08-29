package lti.pojo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="persons")
public class Person {
	@Embedded
	private Person.Id id;
	private String name;
	private int age;
	
	public Person(Id id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	@Embeddable
	public static class Id implements Serializable {
		private String country;
		private int medicareNumber;
		public Id() {

		}

		public Id(String country, int medicareNumber) {
			this.setCountry(country);
			this.setMedicareNumber(medicareNumber);
		}

		
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}

		
		
		public int getMedicareNumber() {
			return medicareNumber;
		}
		public void setMedicareNumber(int medicareNumber) {
			this.medicareNumber = medicareNumber;
		}

	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public Person.Id getId() {
		return id;
	}
	public void setId(Person.Id id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
