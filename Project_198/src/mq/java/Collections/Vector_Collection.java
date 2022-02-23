package mq.java.Collections;

import java.util.Vector;

public class Vector_Collection {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>(5,2);
		v.add("firefox");
		v.add("chrome");
		v.add("safari");
		v.add("opera");
		v.add("edge");
		v.add("ie");
		
		for (String string : v) 
		{
			System.out.println(string);
		}
		
		
	}

}
