package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ds.graph.BusinessGraph;
import ds.graph.Person;
import ds.graph.Business;


class BusinessGraphTest {

	BusinessGraph bg = new BusinessGraph();
	
	@BeforeEach
	void setUp() throws Exception {
	
		// Create Business to insert into the social graph. 
		Business a1 = new Business("Business1", 10, .1f);
		Business a2 = new Business("Business2", 20, .2f);
		Business a3 = new Business("Business3", 30, .3f);
		Business a4 = new Business("Business4", 40, .4f);
		Business a5 = new Business("Business5", 50, .5f);
		
		bg.addVertex(a1);
		bg.addVertex(a2);
		bg.addVertex(a3);
		bg.addVertex(a4);
		bg.addVertex(a5);
		
		
		Business b1 = new Business("Business6", 60, .6f);
		Business b2 = new Business("Business7", 70, .7f);
		Business b3 = new Business("Business8", 80, .8f);
		Business b4 = new Business("Business9", 90, .9f);
		Business b5 = new Business("Business10", 100, .10f);
		
		bg.addVertex(b1);
		bg.addVertex(b2);
		bg.addVertex(b3);
		bg.addVertex(b4);
		bg.addVertex(b5);
		
		
	
		
	}
}
