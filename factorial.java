import java.util.*;
class factorial
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
System.out.println("Factorial");
}
static int fact(int n)
{
if(n==0)
return 1;
else
return n*fact(n-1);
}
}