package test;

public class This_key {
	
	//Static variables
	static int num1=250; //Static variable
	static String S1="Sagar";

	//Non Static variables
	int num2=350; //Non static variable

public void m1()
{
	int num2=450; //local
	System.out.println(num2);// local variable
	}


public void m2()
{
	int num1=550;
	System.out.println(num1);
	System.out.println(this.num2);
	
}
public static void main(String[] args)
{
	System.out.println(num1);
	This_key ref1=new This_key();
	ref1.m2();
	ref1.m1();
	
}
}