package treemap3;

import java.util.*;

public class search {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	public static void main(String[] args) {
		search s=new search();
		s.ser();
		
		// TODO Auto-generated method stub

	}
 public void ser() {
	 t1.put(1,"Gopal");
	  t1.put(2,"Axelrod");
	  t1.put(3,"Thomas");
	  System.out.println("Enter the key to search value");
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	  String s = null;
	  
	  for(Map.Entry<Integer, String> entry:t1.entrySet()) {
		  if(i==entry.getKey()) {
			  s=entry.getValue();
			  break;
		  }
	  }
	  System.out.println("The value for the entered key is "+s);
	  
 }
}
