import java.util.*;
class TwinPrime
{
	public static int prime(int x)
	{
		int indicator=0;
		for(int i=2;i<=(x/2);i++)
		{
			if(x%i==0)
			{
				indicator=1;
				break;
			}
		}
		return indicator;
	}
	public static void main(String... a)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Starting Number:");
		int start=s.nextInt();
		System.out.print("Ending Number:");
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(prime(i)==0 && prime(i+2)==0)
			{
				System.out.println(i+"   "+(i+2));
			}
		}
	}
}