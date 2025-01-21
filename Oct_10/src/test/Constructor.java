package test;

public class Constructor 
{
	int x; //Create a attribute
	public Constructor()
	{
		
		x=5;//set the initial value for the class structure
		
	}

	public static void main(String[] args) {
		Constructor MyCons = new Constructor();// Create an object of class Constructor(This wil call contstrutcor)
		System.out.println(MyCons.x);
	}
	

}
