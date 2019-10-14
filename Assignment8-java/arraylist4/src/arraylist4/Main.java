package arraylist4;

import java.util.*;



public class Main {
	List<String> a=new ArrayList<>();
	public static void main(String[] args) {
		Main m=new Main();
		m.sort();
		// TODO Auto-generated method stub

	}
	public void sort() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		a.sort(null);
		System.out.println("sorted list");
		for(String i:a) {
			System.out.println(i);
			
		}
	}

}
