package treemap5;

import java.util.TreeMap;

public class reverse {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();

  public static void main(String[] args) {
	  reverse r=new reverse();
	  r.rev();
  }
   public void rev() {
	   t1.put(1,"Gopal");
		  t1.put(2,"Axelrod");
		  t1.put(3,"Thomas");
		  System.out.println("Original:");
		  System.out.println(t1.toString());
		  System.out.println("Reversed:");
		  for(int i=t1.size();i>0;i--) {
			  System.out.print(i+"="+t1.get(i)+" ");
			  
		  }
		 
		 
		  
		  
   }
}
