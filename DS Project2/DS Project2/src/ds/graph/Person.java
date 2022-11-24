package ds.graph;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
	
	
	//Attributes
	public String name;
	public int age;
	public ArrayList<Person> contacts = new ArrayList<Person>();
	
	private float socialHygine;
	
	
	//Additional Attribute
	public Business destBusiness;
	

	

	//Constructor
	public Person(String name, int age, float socialHygine) {
		this.name = name;
		this.age = age;
		this.socialHygine = socialHygine;
	}
	


	//Calculate the persons indectiveness
	public int infectiveness() {
		
		int infectiveness;
		
		return infectiveness = (int) ((age/100) - (socialHygine * (age/100)));
		
	}


	//Getters & Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public ArrayList<Person> getContacts() {
		return contacts;
	}


	public void setContacts(ArrayList<Person> contacts) {
		this.contacts = contacts;
	}


	public float getSocialHygine() {
		return socialHygine;
	}


	public void setSocialHygine(float socialHygine) {
		this.socialHygine = socialHygine;
	}
	
	
	
	//Additional Methods
	public void setBusiness(Business bus) {
		
	}
	
	public Business getBusiness() {
		
		return destBusiness;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, contacts, name, socialHygine);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(contacts, other.contacts) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(socialHygine) == Float.floatToIntBits(other.socialHygine);
	}


	// To String method with format Person: <Name>, <age>. Contacts: <length of contacts list>. 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contacts=" + contacts + "]";
	}

	
}
