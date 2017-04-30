
public class Sol {

	public static void main(String args[])
	{
		String s="ABa-CD-F";
	
		char[] ch=s.toCharArray();
		String newString="";
		int ascii=(int)ch[0];
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='-')
			{
				
				
				newString=newString+ch[i];
				
			}
				
		}
		System.out.println(newString);
		int length=newString.length();
		int k=4;
		System.out.println(length/k);
	}
}
