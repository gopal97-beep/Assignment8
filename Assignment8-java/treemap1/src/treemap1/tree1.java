package treemap1;
import java.util.*;

public class tree1 {
             TreeMap<Integer  ,String> tm=new TreeMap<Integer ,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree1 t=new tree1();
		t.tr();

	}
  public void  tr() {
	  tm.put(1,"Gopal");
	  tm.put(2,"Axelrod");
	  tm.put(3,"Thomas");
	  System.out.println("Enter the key to be added");
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	  System.out.println("Enter the value to be added");
	  String j=sc.next();
	  tm.put(i,j);
	  System.out.println("the treemap is: "+tm);;
	  
	  
	  
	  
  }
}
