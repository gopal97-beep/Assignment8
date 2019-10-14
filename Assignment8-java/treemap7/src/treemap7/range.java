package treemap7;

import java.util.*;
import java.util.TreeMap;

public class range {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();

	public static void main(String[] args) {
		range r=new range();
		r.ran();
			
		// TODO Auto-generated method stub

	}
	public void ran() {
		 t1.put(1,"Gopal");
		  t1.put(2,"Axelrod");
		  t1.put(3,"Thomas");
		  t1.put(4,"shravan");
		  t1.put(5,"Chetan");
		  System.out.println("Enter the  first key value");
		  Scanner sc=new Scanner(System.in);
		  int i=sc.nextInt();
		  System.out.println("Enter the  second key value");
		  
		  int i1=sc.nextInt();
		  for(int j=i;j<i1;j++) {
			  t2.put(j,t1.get(j));
			  
		  }
		  System.out.println("values inbetween range "+t2);
		  
		 
		 
		  
		 
	}

}
