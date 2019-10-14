package linkedlist6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class convert {
	List<String> a=new LinkedList<>();
	List<String> b=new ArrayList<>();
	
	public static void main(String [] args) {
		convert c=new convert();
		c.con();
		
	}
	public void con() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		a.add("java");
		a.add("c++");
		a.add("PHP");
		
		for (String i:a) {
			b.add(i);
		}
		System.out.println("Linked list : "+a);
		System.out.println("Array list : "+b);
	}

}
