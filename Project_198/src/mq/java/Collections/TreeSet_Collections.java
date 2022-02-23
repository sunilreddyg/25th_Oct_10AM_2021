package mq.java.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Collections 
{
	
	public static void main(String args[])
	{
		
		Set<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("three");
		set.add("five");
		set.add("six");
		set.add("seven");
		
		//Remove single object from collection
		set.remove("four");
		
		
		//Get Collection count
		int Count=set.size();
		System.out.println("Object Counit is --> "+Count);
		
		
		//Verify object contains at collection
		boolean flag=set.contains("four");
		System.out.println("Object available status is ---> "+flag);
		
		
		//Read First iterator or Next iterator value
		String itr=set.iterator().next();
		System.out.println("First Iterator value is --> "+itr);
		
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Empty Status is --> "+flag1);
		
		
		//Read all objects using foreach loop
		for (String eachobject : set) 
		{
			System.out.println("=>"+eachobject);
		}
		
		
		//Read all object using while loop
		Iterator<String> iterator=set.iterator();
		
		//Read until Collection has next values..
		while(iterator.hasNext())
		{
			//Read next keyword..
			String object=iterator.next();
			System.out.println(object);
		}
	}

}
