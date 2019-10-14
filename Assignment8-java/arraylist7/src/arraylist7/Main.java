package arraylist7;

import java.util.*;



public class Main {
	List<String> a=new ArrayList<>();
	List<String> b=new ArrayList<>();

	public static void main(String[] args) {
		Main m=new Main();
		m.compare();
		// TODO Auto-generated method stub

	}
	public void compare() {
		boolean p=true;
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		b.add("ezio");
		b.add("Altair");
		b.add("connor");
		System.out.println("Current list a:");
		for(String i:a) {
			System.out.println(i);
			
		}
		System.out.println("Current list b:");
		for(String i:b) {
			System.out.println(i);
			
		}
	 for( String i:a) {
		 if(b.contains(i)) {
			p=true;
			
		 }
		 else {
			 p=false;
			 break;
		 }
	 }
	    if(p==false)
	    {System.out.println("The lists are not equal");
		 
	 }
	    else {System.out.println("The lists are equal");
	    	
	    }
		
	}

	}
	
