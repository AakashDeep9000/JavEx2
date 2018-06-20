package main;
import java.util.*;

public class InputReverser {

	public static String[] reverse(String example) {
//		String example="Hello";
		String[] reverse = new String[2];
		reverse[0]="";reverse[1]="False";
		for(int i=example.length()-1;i>=0;i--)
		{
			reverse[0] = reverse[0] + example.charAt(i);
		}
//		System.out.println(reverse);
	if(reverse[0].equals(example))
	{
		reverse[1]="True";
	}
	System.out.println(Arrays.toString(reverse));
		return reverse;
}

}
