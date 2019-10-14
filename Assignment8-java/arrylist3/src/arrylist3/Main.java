package arrylist3;

import java.util.*;

public class Main {
	List<String> a=new ArrayList<>();
	public static void main(String [] args) {
		Main m=new Main();
		m.search();
		
	}
	public void search() {
		a.add("ezio");
		a.add("Altair");
		a.add("connor");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		System.out.println("Enter the element to search in the list");
		Scanner sc=new Scanner(System.in);
		String i1=sc.next();
		int o=a.indexOf(i1);
		System.out.printf("The element %s is present at index %d",a.get(o),o);
	}

}
