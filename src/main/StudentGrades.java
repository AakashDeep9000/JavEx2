package main;

public class StudentGrades {
	public static int studgrades(int[] grades)
	{
		avg(grades);
		min(grades);
		max(grades);
		return 0;
	}
	
	public static float avg(int[] g)
	{
		float average=0;int count =0;
		for(int i=0;i<g.length;i++)
		{
			average+=g[i];
			count++;
		}
		average = average/count;
		return average;
		
	}
	
	public static int max(int[] gr)
	{
		int max=gr[0];
		for(int i=1;i<gr.length;i++)
		{
			if(gr[i]>max)
			{
				max=gr[i];
			}
		}
		return max;
		
	}
	
	public static int min(int[] gr)
	{
		int min=gr[0];
		for(int i=1;i<gr.length;i++)
		{
			if(gr[i]<min)
			{
				min=gr[i];
			}
		}
		return min;
		
	}
	
	

}
