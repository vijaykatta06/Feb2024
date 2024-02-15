package package_java;
public class VariablesDatatypesinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java supports differnt data types
		int mynum=2; //number is interger
		String website ="vijay_project"; //string for names
		char letter ='v'; // for character
		float deca =20.0f;
		double dec= 5.010; // for decimal values 
		Boolean crt =true;
		
		//System.out.println(mynum+" muy value is");
		
		//ARRAYS
		//Arrays can store multiple values in one single variable
		//If you have a requirement of storing more than one value into a variable.So that variable we call it as an array.
		
		int[] arr = new int[5];               //So basically you give an operator called new, you will actually create memory for those many values
		
		//above Okay, so here we just declared an array and have allocated memory for storing five elements. We actually did not assign values here.
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//So there is another way also to create an initialize the array.
		int[] arr2 = {1,2,3,4,5,67,87};
		System.out.println(arr2[1]);
		//for loop
		// for loop can iterate over the each and every element of this array and can print values of it.
		for(int i=0;i<arr.length;i++) 
		{
		
			System.out.println(arr[i]);
		}
		
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		//we can do same strings array and for loop
		
		String[] names = {"vijay","kumar","katta"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		//So now there is another way also to declare this for loop.We call it as a enhanced for loop.
		//Okay, simplified syntax of this for loop.
		//So from this array now every time in every iteration one has to be picked out, one element has to be
		//picked out.
		//So that element you can declare here, let's create another variable called S.
		for(String s : names)
		{
			System.out.println(s);
		}
	}

}
