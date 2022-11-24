package ds.graph;

import java.util.ArrayList;
import java.util.Objects;

public class Business extends Person{
	
	public Business(String name, int age, float socialHygine) {
		super(name, age, socialHygine);	
	}


	//Attributes
	public String name;
	public ArrayList<Person> edges = new ArrayList<Person>();
	
	
 
	
	public void addEdge(Business dest, Person route) throws BusinessDoesNotExist, PersonDoesNotExist {
		
		
		
		if (!edges.contains(dest)) {
			throw new BusinessDoesNotExist ("Error Person does not exist. Edge cannot be created.");
		}
		
		if (!contacts.contains(route)) {
			throw new PersonDoesNotExist("Error Person does not exist. Edge cannot be created.");
		}
//		edges.add(dest);
//		contacts.add(route);
		if (!edges.contains(dest)) {
			
			ArrayList<Person> edge = new ArrayList<Person>();
			edge.add(route);
			
			edges.add(dest, edge);
			
		} else {
			
			//Update
			ArrayList<String> oldL = edges.get(dest);
			
			int index = 0;
            while ((index != oldL.size()) && (!oldL.get(index).equals(route))) {
                index++;
            }
            
            if (index == oldL.size()) {
                oldL.add(route);
                edges.add(dest, oldL);
            }
			
		}
		
		
		
		
		
	}
	
	
	
	
	public void removeEdge(Business dest) {
		edges.remove(dest);
			
	}
	
	
	
	
	

}
