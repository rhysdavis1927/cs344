package com.rhys.core;

import java.util.ArrayList;

public class Predicate {
    String name;
    int arity;
    ArrayList<String> arguments;
    
    Predicate(String name, ArrayList<String> arguments) {
	this.name =name;
	this.arity = arguments.size();
	this.arguments = arguments;
	
    }
    
    public String toString() {
	String result = name;
	if (arity != 0) {
	    result= result +"(";
	    for (String arg : arguments) {
		result= result + arg + ",";
	    }
	    result= result +")";
	}
	return result;
    }
}
