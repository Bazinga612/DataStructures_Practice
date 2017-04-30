package DynamicProgramming;

import java.text.DecimalFormat;

public class Main {
    public static String SEPARATOR = "@";
    public static final String COLON = ":";
    private static DecimalFormat df = new DecimalFormat("#.00");
    /*
     * Complete the function below.
     *
 	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */

    static String generateTransactions(String input) {
        String finalbenchmark="";
    
    String tempbenchmark[]=input.split(":");
    String tempbenchMarked2[]=tempbenchmark[0].split("@");
    String tempbenchMarked[]=tempbenchmark[1].split("@");
    String result[];
    
    
    for(int i=0;i<tempbenchMarked.length;i++)
    {
        String temp1="";
        for(int j=i+1;j<tempbenchMarked.length;j++)
        {
            if((int)tempbenchMarked[i].charAt(0)>(int)tempbenchMarked[j].charAt(0))
            {
            temp1=tempbenchMarked[j];
            tempbenchMarked[j]=tempbenchMarked[i];
            tempbenchMarked[i]=temp1;
            break;
            }
            else if((int)tempbenchMarked[i].charAt(0)==(int)tempbenchMarked[j].charAt(0))
            {
            if((int)tempbenchMarked[i].charAt(1)>(int)tempbenchMarked[j].charAt(1))
            {
                temp1=tempbenchMarked[j];
            tempbenchMarked[j]=tempbenchMarked[i];
            tempbenchMarked[i]=temp1;
            break;
            }
            }
        }
        
    }
    for(int i=0;i<tempbenchMarked2.length;i++)
    {
        String temp2="";
        for(int j=i+1;j<tempbenchMarked2.length;j++)
        {
            if((int)tempbenchMarked2[i].charAt(0)>(int)tempbenchMarked2[j].charAt(0))
            {
            temp2=tempbenchMarked2[j];
            tempbenchMarked2[j]=tempbenchMarked2[i];
            tempbenchMarked2[i]=temp2;
            break;
            }
            else if((int)tempbenchMarked2[i].charAt(0)==(int)tempbenchMarked2[j].charAt(0))
            {
            if((int)tempbenchMarked2[i].charAt(1)>(int)tempbenchMarked2[j].charAt(1))
            {
                temp2=tempbenchMarked2[j];
            tempbenchMarked2[j]=tempbenchMarked2[i];
            tempbenchMarked2[i]=temp2;
            break;
            }
            }
        }
        
    }
    String finalportfoliobenchmark="";
    for(int i=0;i<tempbenchMarked.length;i++)
    {
        result=tempbenchMarked[i].split(",");
        String result1[]=tempbenchMarked2[i].split(",");
        if(Double.parseDouble(result[2])>Double.parseDouble(result1[2]))
        {
            double calculate=Double.parseDouble(result[2])-Double.parseDouble(result1[2]);
         result[1]=result[0];
        result[0]="BUY";
        result[2]=String.valueOf(df.format(calculate));
        }
        else
        {
            double calculate=Double.parseDouble(result1[2])-Double.parseDouble(result[2]);
            result[1]=result[0];
        result[0]="SELL";
        result[2]=String.valueOf(df.format(calculate));
        }
    if(i!=tempbenchMarked.length-1)
    finalportfoliobenchmark=finalportfoliobenchmark+"["+result[0]+", "+result[1]+", "+result[2]+"], ";
    else
        finalportfoliobenchmark=finalportfoliobenchmark+"["+result[0]+", "+result[1]+", "+result[2]+"]";
    }
    
        return finalportfoliobenchmark;
    }    
    


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        res = generateTransactions(_input);
        System.out.println(res);
    }
}