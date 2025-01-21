package test;


public class method_call 
{
public static void method1()
{
	System.out.println("Hello");

}
public void nonStaticMethod()
{
	System.out.println("Hello NonStatic");
	System.out.println();
	method1();
	method_call_01.method01();
}

public static void main(String[] args)

{
//method1();// calling static method in the same class
//classname.methodname(); //calling static method outside the class
	method_call ref1 = new method_call();
	ref1.nonStaticMethod();


}
}

