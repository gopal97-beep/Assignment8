package arraylist;
import java.util.*;
public class Main {
       List<String> a=new ArrayList<>();
       
	public static void main(String[] args) {
		Main m=new Main();
		m.add1();
		// TODO Auto-generated method stub

	}
  public void add1() {
	  a.add("Activison");
      a.add("EA");
      a.add("AC");
	  System.out.println("Enter the element to add at  first");
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  a.add(0,s);
	  for(String i:a) {
		  System.out.println(i);
	  }
	  
	  
	  
  }
}
