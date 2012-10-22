package com.rhys.core;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

public class Parser {
    int brackets;
    
    Parser() {
	
    }
    
    public void parse(String formula) {
	CharacterIterator it = new StringCharacterIterator(formula);
	
	for (char ch = it.first(); ch != CharacterIterator.DONE; it.next()) {
	    if (ch == '(') {		
		brackets++;
	    }
	    else if (ch == ')') {
		brackets--;
	    }
	    
	}
    }

}
