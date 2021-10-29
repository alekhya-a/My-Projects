import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
	      Scanner abc = new Scanner(System.in);  //abc is object
	      
	      System.out.println("Enter a number: ");
	      
	      int num = abc.nextInt();  //num is variable
	      
	      //if(num%2==0)
	    	//  System.out.println(num+ " is Even");
	      
	      //else
	    	//  System.out.println(num+ " is Odd");
	      
	      String evenOdd = (num % 2 == 0) ? "even" : "odd";  //using Ternary operator

	      System.out.println(num + " is " + evenOdd);
	      
	}

}
