import java.util.*;
public class XR {

	HashMap<String,String []> colours=new HashMap<>();
	XR()
	{
		String red[]={"red","blank"};
		colours.put("red",red);
		String blue[]={"blue","blank"};
		colours.put("blue",blue);
		String yellow[]={"yellow","blank"};
		colours.put("yellow",yellow);
		String purple[]={"blue","red"};
		colours.put("purple",purple);
		String green[]={"blue","yellow"};
		colours.put("green",green);
		String orange[]={"red","yellow"};
		colours.put("orange",orange);
	
	}
	public String[] generate(String arr[])
	{
		String input[] = new String[arr.length-1];
		input[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(i==input.length-1)
				break;
			String temp[]=colours.get(arr[i]);
			if(input[i-1]==temp[0])
				input[i]=temp[1];
			else
				input[i]=temp[0];
			
		}
		input[input.length-1]=arr[arr.length-1];
		return input;
	}
	/*
	 * Complete the function below.
	 */

	    


	public static void main(String args[])
	{
		XR xr=new XR();
		String arr[]={"red", "purple", "green", "orange", "purple", "purple", "orange", "yellow", "yellow", "yellow"};
		xr.generate(arr);
		int i;
		do{
			i++;
		}
		while(i<0);
		{
			System.out.println(i);
		}
	}
}
