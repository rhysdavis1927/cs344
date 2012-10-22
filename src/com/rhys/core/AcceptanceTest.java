package com.rhys.core;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;


public class AcceptanceTest {

    @Test
    public void canCreateAPropositionalAtom() {
	Predicate pred = new Predicate("P", new ArrayList<String>());
	System.out.println(pred);
    }
    
    @Test
    public void canCreateAFormualOfPropositionalLogic () {
	
    }
    
    @Ignore
    @Test
    public void canCreateaFunction() {
	Set domain = new HashSet();
	domain.add("Fred");
	domain.add("Dave");
	Map<K, V> map = new HashMap();
	map.put("Fred", "a");
	Function f = new Function(domain,map);
	
    }

}
