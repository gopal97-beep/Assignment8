package linkedlist2;

import java.util.*;


public class Main {
	List<String> a=new LinkedList<>();
	public static void main(String[] args) {
		Main m=new Main();
		m.print();
		// TODO Auto-generated method stub

	}
	public void print() {
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
		System.out.println("Enter the index");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("displaying list from entered index");
		for(int j=i;j<a.size();j++)
		{ System.out.println(a.get(j));
		
	}

}
}
