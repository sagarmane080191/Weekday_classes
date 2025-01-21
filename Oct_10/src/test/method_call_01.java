package test;


public class method_call_01 
{
public static void method01()
{
	System.out.println("Hello from another class");

}

public static void main(String[] args)

{
method01();// calling static method in the same class
//classname.methodname(); //calling static method outside the class


}
}

