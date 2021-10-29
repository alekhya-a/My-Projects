
public class swapTemp {

	public static void main(String[] args) {
		float a=23.6f, b=45.3f;
		System.out.println("Before Swap");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		float temp = a;
		a=b;
		b=temp;
		System.out.println("After Temp");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
