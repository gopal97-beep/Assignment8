package treemap2;

import java.util.*;
	

public class copy {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();
	

	public static void main(String[] args) {
		copy c=new copy();
		c.cop();
		// TODO Auto-generated method stub

	}
	public void cop() {
		 t1.put(1,"Gopal");
		  t1.put(2,"Axelrod");
		  t1.put(3,"Thomas");
		 
			t2.putAll(t1);
			System.out.println("first treemap : "+t1);
			System.out.println("second treemap : "+t2);
			  
			  
		  }
		   
	}


