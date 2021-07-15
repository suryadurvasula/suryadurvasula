import java.util.*;
class TwinPrime2
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
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Starting Number:");
		int start=sc.nextInt();
		System.out.print("Ending Number:");
		int end=sc.nextInt();
  int count=0;
		for(int i=start;i<=end;i++)
		{
			if(prime(i)==0 && prime(i+2)==0)
			{
				count++;
			}
		}
	}
}
