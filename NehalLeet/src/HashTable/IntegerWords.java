package HashTable;

import java.util.HashMap;

public class IntegerWords {

	String units[]={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	String tens[]={"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	String notations[]={"","hundred","thousand","million","billion"};
	
	
public void numberToWords(int num) {
        String length=String.valueOf(num);
        char ch[]=length.toCharArray();
        int [] intarray={4,7};
        /*for(int i=0;i<=ch.length-1;i++)
        {
        	intarray[i]=Integer.valueOf(length.charAt(i));
        }
        */
        String result="";
        if(length.length()<=2)
        {
        	if(intarray[0]>1)
        	{result=result+tens[intarray[0]];
        	result=result+units[intarray[1]];
        	}
        	else
        		result=result+units[intarray[0]+12];
        }
       System.out.println(result);
	
    }
public void unit_calculate()
{
	
}
public static void main(String args[])
{
	IntegerWords iw=new IntegerWords();
	iw.numberToWords(47);
}
}
