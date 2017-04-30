
public class Demo1 {
	public int countHi(String str) {
		  if(str.length()<2)
		  return 0;
		  if(str.substring(0,2).equals("hi"))
		  return 1+countHi(str.substring(2));
		  return countHi(str.substring(1));
		}
	public static void main()
	{
		Demo1 d=new Demo1();
		d.countHi("xxhixx");
	}
}
