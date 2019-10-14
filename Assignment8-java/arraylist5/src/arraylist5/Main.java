package arraylist5;

import java.util.*;



public class Main {
	List<String> a=new ArrayList<>();
	public static void main(String[] args) {
		Main m=new Main();
		m.shuffle();
		// TODO Auto-generated method stub

	}
	public void shuffle() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		a.add("con");
		a.add("decon");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		Collections.shuffle(a);
		System.out.println("Shuffled list");
		for(String i:a) {
			System.out.println(i);
			
		}
	}

}
