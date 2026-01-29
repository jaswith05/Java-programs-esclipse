package jaswithp;

public class Trycatchexample {

	public static void main(String[] args) {
		{
			try {
				int arr[]= {10, 0, 30};
				
				int result= arr[0]/arr[1];
				System.out.println(result);
				
				System.out.println(arr[5]);
				
				}
				 catch(ArithmeticException e)
				{
				System.out.println(" Arithmetic Exception occurred");
				}
			 
				catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of");
			}
			catch (Exception e)
			{
					System.out.println("Generic Exception");
			}
			}
			}
		// TODO Auto-generated method stub

	}

