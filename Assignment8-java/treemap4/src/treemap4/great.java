package treemap4;

import java.util.Map;
import java.util.TreeMap;

public class great {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();

	public static void main(String[] args) {
		great g=new great();
		g.ger();
			
		// TODO Auto-generated method stub

	}
	public void ger() {
		 t1.put(1,"Gopal");
		  t1.put(2,"Axelrod");
		  t1.put(3,"Thomas");
		  int g=0;
		  int l = 1;
		  for(int i:t1.keySet()) {
			  if(g<i) {
				 
				  g=i;
			  }
			  if(l>i) {
				  l=i;
			  }
		  }
		  System.out.println("The value associated with greatest key is "+t1.get(g));
		  System.out.println("The value associated with lowest key is "+t1.get(l));
	}

}
