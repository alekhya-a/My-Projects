
public class Parent 
{

	public static void main(String[] args)
	{
		
		int sum = 0;
	    int n = 1000; 
	    for (int i = 1; i <= n; i++)
	    {         // for loop  
	      sum += i;     // sum = sum + i
	    }
	       
	    System.out.println("Sum = " + sum);
	  
		System.out.println("I navigated to Home Page");
		
		Methods m = new Methods();  // class name object name = new class name();
		
		// new is a memory allocation operator, creates memory for "Methods" class in "Parent" class
		
		m.ValidateHeader();   // Classobj.methodname
		
		System.out.println(m.ValidateHeader());  //this statement gives return value also
		 
	}

}
