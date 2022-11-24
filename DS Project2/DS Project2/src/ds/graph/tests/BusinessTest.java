package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ds.graph.BusinessGraph;
import ds.graph.Person;
import ds.graph.Business;


class BusinessTest {

	Business bg = new Business(null, 0, 0);
	
	@BeforeEach
	void setUp() throws Exception {
	
		// Create Business
		Business a1 = new Business("Business1", 10, .1f);
		Business a2 = new Business("Business2", 20, .2f);
		Business a3 = new Business("Business3", 30, .3f);
		Business a4 = new Business("Business4", 40, .4f);
		Business a5 = new Business("Business5", 50, .5f);
		Business b1 = new Business("Business6", 60, .6f);
		Business b2 = new Business("Business7", 70, .7f);
		Business b3 = new Business("Business8", 80, .8f);
		Business b4 = new Business("Business9", 90, .9f);
		Business b5 = new Business("Business10", 100, .10f);
		Business c1 = new Business("Business11", 110, .10f);
		Business c2 = new Business("Business12", 120, .7f);
		Business c3 = new Business("Business13", 130, .8f);
		Business c4 = new Business("Business14", 140, .9f);
		Business c5 = new Business("Business15", 150, .10f);
		Business c6 = new Business("Business16", 160, .6f);
		Business c7 = new Business("Business17", 170, .7f);
		Business c8 = new Business("Business18", 180, .8f);
		Business c9 = new Business("Business19", 190, .9f);
		Business c10 = new Business("Business20", 200, .10f);
		
		bg.addEdge(a1, c1);
		bg.addEdge(c2, c3);
		bg.addEdge(c4, c5);
		bg.addEdge(c6, c1);
		
		bg.addEdge(b1, c3);
		bg.addEdge(b4, c4);
		
		bg.addEdge(a5, c7);
		bg.addEdge(c8, c9);
		bg.addEdge(b3, c10);
		bg.addEdge(c10, c8);
		
		bg.addEdge(c8, c1);
	}

}
