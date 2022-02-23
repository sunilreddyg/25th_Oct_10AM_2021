package mq.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Collections 
{

	public static void main(String[] args) 
	{
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("three");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		String index_obj=list.get(4);
		System.out.println("4th index object is --> "+index_obj);
		
		
		//Remove single object from collection
		list.remove("four");
		
		
		//Get Collection count
		int Count=list.size();
		System.out.println("Object Counit is --> "+Count);
		
		
		//Verify object contains at collection
		boolean flag=list.contains("four");
		System.out.println("Object available status is ---> "+flag);
		
		
		//Read First iterator or Next iterator value
		String itr=list.iterator().next();
		System.out.println("First Iterator value is --> "+itr);
		
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Empty Status is --> "+flag1);
		
		
		//Apply for loop to iterate all collection of objects
		for (int i = 0; i < list.size(); i++) 
		{
			  String Eachobj=list.get(i);
			  System.out.println("=>"+Eachobj);
		}
		
		
		//Applying foreach loop to iterate all collection of objects
		for (String string : list) 
		{
			System.out.println("#"+string);
		}
		
		
		//Read collection of objects using while loop
		Iterator<String> itrerator=list.iterator();
		while(itrerator.hasNext())
		{
			String SingleObj=itrerator.next();
			System.out.println("@"+SingleObj);
		}
		
		
		
		
		
		
		
	}

}
