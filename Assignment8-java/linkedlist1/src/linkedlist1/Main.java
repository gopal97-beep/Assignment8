package linkedlist1;

import java.util.*;



public class Main {
	List<String> a=new LinkedList<>();

	public static void main(String[] args) {
		Main m=new Main();
		m.append();
		// TODO Auto-generated method stub

	}
	public void append() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		 System.out.println("Enter the element to add at  first");
		  Scanner sc=new Scanner(System.in);
		  String s=sc.next();
		  a.add(a.size(),s);
		  System.out.println("Updated list");
		  for(String i:a) {
			  System.out.println(i);
		  }
		
	}

}
