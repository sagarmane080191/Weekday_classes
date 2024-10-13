package test;

import java.util.Scanner;

public class Demo {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		
//		String name= "Sagar";
//		System.out.println(name);
//		
//		double DOB= 8011991;
//		System.out.println(DOB);
//		
//		float pi= (float) 3555555.144454;
//		System.out.println(pi);
//		// TODO Auto-generated method stub
//		
//		boolean isName= True;
//		System.out.println(isName);
//		
//		int N= 8;
//		System.out.println(N);
//		
		//Array
		int arr[] = new int[size];
		//arr[0]= 55;
		//arr[1]= 66;
		//arr[2]= 77;
		//arr[3]= 88;
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		
		// this for loop is for the input
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		// this for loop is for the output
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==x)
			{				
			System.out.println("x found at index:" +i);
			}
		}
			
		

		

	}

}
