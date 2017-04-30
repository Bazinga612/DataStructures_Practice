package General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Matrix {

	
public List<Integer> spiralOrder(int[][] matrix) {
        
	List answer=new ArrayList();
	for(int i=0;i<matrix.length;i++)
	{
		if(i%2==0)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				answer.add(matrix[i][j]);
			}
		}
		else
		{
			for(int j=matrix[i].length-1;j>=0;j--)
			{
				answer.add(matrix[i][j]);
			}
		}
	}
	return answer;
    }


public boolean sudokoSolver(char m[][])
{
	HashMap hm=new HashMap();
	int l=0;
	while(l<m[0].length)
	{
	for(int i=l;i<l+3;i++)
	{
		for(int j=0;j<m[i].length;j++)
		{
			if(m[i][j]!='-')
			{
				if(hm.containsKey(m[i][j]))
						return false;
				else
					hm.put(m[i][j], 1);
			}
		}
	}
	l=l+3;
	}
	return true;
}
	public static void main(String args[])
	{
		Matrix m=new Matrix();
		int m1[][]={{1, 2, 3},{4,5,6	},{7,8,9}};
		char m2[][]={{'5','3','-','-','7','-','-','-','-'},{'6','-','-','1','9','5','-','-','-'},{'-','9','8','-','-','-','-','6','-'}};
		System.out.println(m.sudokoSolver(m2));
	}
}
