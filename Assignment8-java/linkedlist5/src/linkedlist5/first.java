package linkedlist5;

import java.util.*;

public class first {
	List<String> a=new LinkedList<>();
	public static void main(String [] args) {
		first f=new first();
		f.fir();
		
		
	}
	public void fir() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		a.add("java");
		a.add("c++");
		a.add("PHP");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		
		String h=a.remove(0);
		System.out.println("After removing first element");
		for(String i:a) {
			System.out.println(i);
			
		}
		System.out.println("the first element is "+h);
		
		
	}

}
