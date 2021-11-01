
public class IfElseInsideForLoop
{

	public static void main(String[] args)
	{
		int[] arr = {10,23,44,56,79,83,90};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] %2 == 0)
			{	
				System.out.println(arr[i]);
			}
			
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}
	}

}
