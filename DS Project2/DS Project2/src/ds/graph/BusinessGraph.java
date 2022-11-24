package ds.graph;

import java.util.ArrayList;

public class BusinessGraph {
	
	    //Attributes
	    public int numVertices; 
		public ArrayList<Business> vertices = new ArrayList<Business>();
		
		
		
		public void addVertex(Business bus) {
			if (vertices.contains(bus.name))
				throw new PersonAlreadyExists("Cannot create new vertex with existing person.");
			vertices.add(bus.name, bus);
			
		}
		
		
		public void removeVertex(Business bus) {
			
			for (int i = 0; i < numVertices; i++)
		      {
		         if (bus.equals(vertices[i]))
		         {
		            removeVertex(i);
		            return;
		         }
		      }
			
		}
		
		
		public int totalPersonInfected(Business start) {
			return 0;
		}
		
		
		public int minStepsToDestFromStart(Business start, Business dest) {
			return 0;
			
		}
		
		public boolean isStronglyConnected(Business start) {
			return false;
			 
		}
		
		

}
