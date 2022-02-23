package mq.java.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_Interface 
{

	public static void main(String[] args) 
	{
		
		
		Map<Number, String> map=new HashMap<Number,String>();
		map.put(100, "iphone");
		map.put(101, "samsung");
		map.put(102, "oppo");
		map.put(103, "OnePlus");
		map.put(null, null);
		map.put(104, null);
		
		
		
		
		//Get Single pair object
		String Mobile=map.get(103);
		System.out.println(Mobile);
		
		//Read all values using keynames
		for (Number eachkey : map.keySet()) 
		{
			String value=map.get(eachkey);
			System.out.println(value);
		}
		
		
		
		Map<Number, String> table=new Hashtable<Number,String>();
		table.put(100, "iphone");
		table.put(101, "samsung");
		table.put(102, "oppo");
		table.put(103, "OnePlus");
		
		
		//Read all object using keynames
		for (Number key : table.keySet()) {
			System.out.println(table.get(key));
		}
		
	}

}
