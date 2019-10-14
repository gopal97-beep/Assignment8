package treemap6;

import java.util.*;
import java.util.TreeMap;

public class less {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();

	public static void main(String[] args) {
		less l=new less();
		l.les();
			
		// TODO Auto-generated method stub

	}
	public void les() {
		 t1.put(1,"Gopal");
		  t1.put(2,"Axelrod");
		  t1.put(3,"Thomas");
		  System.out.println("Enter the key value");
		  Scanner sc=new Scanner(System.in);
		  int i=sc.nextInt();
		  for(int j=1;j<i;j++) {
			  t2.put(j,t1.get(j));
			  
		  }
		  System.out.println("values from key entered "+t2);
		  
		 
		 
		  
		 
	}

}
