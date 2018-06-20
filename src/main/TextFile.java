package main;
import java.io.*;

public class TextFile {

	  public static String[] textfile()throws Exception
	  {
		  String[] ret=new String[2];int len;
	  File file = new File("/home/aakash/workspace/demo/javatest.txt");
	 
	  BufferedReader br = new BufferedReader(new FileReader(file));
	 
	  String st;
	  while ((st = br.readLine()) != null)
	  {
	    ret[0]=ret[0]+st;
	  }
	  ret[0]=ret[0].toUpperCase();
	  ret[1]=Integer.toString(ret[0].length());
	  return ret;
	  }
}
