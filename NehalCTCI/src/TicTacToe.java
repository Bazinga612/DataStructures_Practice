import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

	 int multi[][]=new int[2][2];
	 ArrayList<ArrayList<Integer>>  positionteam1=new ArrayList<ArrayList<Integer>>();
	 ArrayList<ArrayList<Integer>>  positionteam2=new ArrayList<ArrayList<Integer>>();
	public TicTacToe() {
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				multi[i][j]=0;
			}
		}
		 
	}
	public void play(int team,int position1,int position2)
	{
		if(multi[position1][position2]==0)
		{
			multi[position1][position2]=team;
		}
		else
		{
			System.out.println("Enter another position");
		}
		if(team==1)
		{
			
			ArrayList<Integer> position11 = new ArrayList<Integer>(5);
			for(int j = 0; j < 3; j++)
	           {
				if(j==position2)
					position11.add(1, 1);
	            }
			
			positionteam1.add(position11);
			
		}
		else
			positionteam2.get(position1).set(position2, 2);
		if(winner()==2)
			System.out.println("Winner is team2");
		else
			System.out.println("Winner is team1");
	}
	public int winner()
	{ int team=0;
	int position1x=0;
	
	int position1y=0;
	for(int i=0;i<positionteam1.size();i++)
	{
		for(int j=0;i<positionteam1.size();i++)
		{
		if(positionteam1.get(i).get(j)!=0)
		{
			position1x=position1x+i;
			position1y=position1y+j;
		}
		}
	}
	if((position1x%3==0) && (position1y%3==0))
	{
		return 1;
	}
int position2x=0;
	
	int position2y=0;
	for(int i=0;i<positionteam2.size();i++)
	{
		for(int j=0;i<positionteam2.size();i++)
		{
		if(positionteam1.get(i).get(j)!=0)
		{
			position2x=position2x+i;
			position2y=position2y+j;
		}
		}
	}
	if((position2x%3==0) && (position2y%3==0))
	{
		return 2;
	}
		return 0;
	}
	public static void main(String args[])
	{
		TicTacToe tc=new TicTacToe();
		tc.play(1,0,1);
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter 1 if you are team 1 or 2 if team 2");
		switch(in.nextInt())
		{
		
		case 1:
			{
			/*	System.out.println("Enter position1");
				Scanner position1=new Scanner(System.in);
				System.out.println("Enter position2");
				Scanner position2=new Scanner(System.in);*/
				
			}
		break;
		case 2:
			{
				System.out.println("Enter position1");
				Scanner position1=new Scanner(System.in);
				System.out.println("Enter position2");
				Scanner position2=new Scanner(System.in);
				tc.play(2,position1.nextInt(),position2.nextInt());
				
			}
		break;
		}
	
		
	}
}
