package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
        list.add("ajay");
        list.add("vijay");
        list.add("sanjay");
        
       for (String s:list) {
    	   System.out.println(s);
       }
	
	}

}
