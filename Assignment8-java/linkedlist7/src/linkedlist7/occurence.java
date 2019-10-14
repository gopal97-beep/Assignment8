package linkedlist7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class occurence {
	List<String> a=new LinkedList<>();
	public static void main(String [] args) {
		     occurence o=new occurence();
		     o.occ();
		     
	}
	 public void occ() {
			a.add("ezio");
			a.add("Altair");
			a.add("connor");
			a.add("java");
			a.add("c++");
			a.add("PHP");
			a.add("java");
			System.out.println("Current list");
			for(String i:a) {
				System.out.println(i);
				
			}
			System.out.println("Enter th element to search for occurence");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int f=0,l=0;
		
			for(int i=0;i<a.size();i++) {
				if(s.compareTo(a.get(i))==0) {
					f=a.indexOf(a.get(i));
					
					break;
				}
				
				
				
				
			}
			System.out.println("First occurenece is at : "+f);
			for(int i=a.size()-1;i>=0;i--) {
				if(s.compareTo(a.get(i))==0) {
				 l=i;
					break;
				}
				
				
			}
			System.out.println("last occurenece is at : "+l);
	 }
}
