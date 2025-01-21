package test;

public class Method_category
{
	public static void addition(int A, int B, String S, int i, float f) //Arguments or Parameters
	{
		int Ans=A+B;
		System.out.println("Total:" +Ans);
		System.out.println("String:"+S);
		//int i = 0;
		//float f=(float) 1.10;
		System.out.println("i:"+i);
		System.out.println("f:"+f);
		
	}
	
	public static void main(String[] args)
	{
	addition(100,150,"Sagar",8, 101.10f);
	
	}

}
