package test;

public class Local_variable 
{
		static int local=250;
	
public void V1()
{
		int loc_var=300;
	System.out.println("local_variable:" +loc_var);
}

public static void main(String[] args)
{
	
	Local_variable LV= new Local_variable();
	LV.V1();
	System.out.println("wanted:" +local);

	}
}
