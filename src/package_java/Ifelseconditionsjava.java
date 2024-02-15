package package_java;

public class Ifelseconditionsjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//now let's say you want to print the values which are multiplied by two from this array.
		int[] arr2 = {1,2,3,4,5,67,87}; //need only even numbers
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
			
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i]+ "it's not applicable multiply by 2");
			}
		}

	}

}
