
public class swap {

	public static void main(String[] args) {  //without temp
	    float a=39.7f, b=56.2f;
	    System.out.println("Before Swap");
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	    
	    a=a-b;
	    b=a+b;
	    a=b-a;
	    
	    System.out.println("After Swap");
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	    
	    

	}

}
