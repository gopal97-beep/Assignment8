package linkedlist4;

import java.util.*;

public class retrive {
	List<String> a=new LinkedList<>();

	public static void main(String[] args) {
		retrive n=new retrive();
		n.retrive();
		// TODO Auto-generated method stub

	}
 public void retrive() {
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
			int i=a.size();
			System.out.println("the last element is "+a.get(i-1));
 }
}
