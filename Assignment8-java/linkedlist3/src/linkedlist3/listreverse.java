package linkedlist3;

import java.util.*;

public class listreverse {
	List<String> a=new LinkedList<>();

	public static void main(String[] args) {
		listreverse l=new listreverse();
		l.reverse();
		
		// TODO Auto-generated method stub

	}
  public void reverse()
  {
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
		Collections.reverse(a);
		System.out.println("reversed list");
		for(String i:a) {
			System.out.println(i);
			
		}
		
  }
}
