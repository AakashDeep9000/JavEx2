package main;
public class PowOfFour {
	
	public static String powfour(int num)
	{
		String checker= "false";
		int pow=1;
		while(pow<num)
		{
			pow = pow*4;  
		}
		if(pow==num)
		{	
			checker="true";
		}
		return checker;
	}
	public static String powfour(String invalid)
	{
		return "Invalid input";
	}
}
