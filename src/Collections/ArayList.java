/*
What is Collections API
Collections Framework API is unified architecture for representing and manipulating collections.
API contains interfaces, implementation and algorithams to help java programmers in evey day
programming. In nut shell, this API does few things at high level. These are basically it reduces the
programming efforts which intern increases program speed and quality. It allows interporability
among unrelated APIs. it reduces the efforts to learn and use new APIs. it reduces effort to design
new APIs. it encouranges and force us to use.
The most basic interface is Collection. three interfaces extends collection interface. Set, List and 
SortedSet. Map and SortedMap do not extend the collection interface.

What is an Iterator
Some of the collection class provide traversal of their contains via java.util.iterator interface.
this interface allows you to walk through collection of objects and operating on each object intern.

*/
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArayList  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> arrNames = new ArrayList<String>();
		Vector<String> names = new Vector<String>();
		
		arrNames.add("Balachandra");
		arrNames.add("Lokesh");
		arrNames.add(1, "Durga Shankar");
		arrNames.add("Lokesh");
		Iterator itr= arrNames.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String aa: arrNames){
			System.out.println(aa);
		}
		
		al.add("Nalini");
		al.add("Parvathamma");
		
		arrNames.addAll(al);
		
		for (String ab: arrNames){
			System.out.println(ab);
		}
		
		//User-defined class objects in Java ArrayList
		Student s1=new Student(123,"Govind",64);
		Student s2=new Student(124,"Parvathi",60);
		Student s3=new Student(125,"Balachandra",35);
		Student s4=new Student(126,"Lokesh",23);
		
		ArrayList<Student> arrObj = new ArrayList<Student>();
		arrObj.add(s1);
		arrObj.add(s2);
		arrObj.add(s3);
		arrObj.add(s4);

		Iterator it = arrObj.iterator();
		while(it.hasNext()){
			
			Student j=(Student) it.next();
			System.out.println(j.id + " " + j.name + " " + j.age);
		}
	}

}
