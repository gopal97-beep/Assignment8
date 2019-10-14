package arraylist2;

import java.util.*;




public class Main {
    List<String> a=new ArrayList<>();

	public static void main(String[] args) {
		Main m=new Main();
		m.retrive();
		// TODO Auto-generated method stub

	}
	public void retrive() {
		a.add("java");
		a.add("c++");
		a.add("PHP");
		System.out.println("Current list");
		for(String i:a) {
			System.out.println(i);
			
		}
		System.out.println("Enter the index to retrive");
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		System.out.printf("the element at index %d is "+a.get(i1),i1);
		
	}
	
	


}
