package main;
import main.Member;
public class MemberVariables {
public	static String[] returning(String name,int age,double sal)
	{
	String[] ret=new String[3];	
	Member A = new Member();
	A.membinit(name,age,sal);
	ret[0]=A.Name;
	System.out.println("Member name: "+ret[0]);
	ret[1]=Integer.toString(A.age);
	System.out.println("Member name: "+ret[1]);
	ret[2]=Double.toString(A.Salary);
	System.out.println("Member name: "+ret[2]);
	return ret;
	}

}
