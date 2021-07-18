import java.util.*;
class linkMenu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList<Integer>x=new LinkedList<Integer>();
int n,ch;
do
{
System.out.println("1.BeginInsert\n2.EndInsert\n3.Position Insert\n4.Besing Delete\n5.End Delete\n6.Position Delete\n7.Display\n8.Exit\n...Enter your choice.");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter n value");
n=sc.nextInt();
x.addFirst(n);
break;
case 2:System.out.println("Enter n value");
n=sc.nextInt();
x.addLast(n);
break;
case 3:System.out.println("Enter n value");
n=sc.nextInt();
x.indexOf(n);
break;
case 4:
x.removeFirst();
break;
case 5:System.out.println("Enter n value");
n=sc.nextInt();
x.removeLast();
case 6:System.out.println("Enter n value");
int P=sc.nextInt();
x.remove(P);
break;
case 7:System.out.println(x);
break;
default:System.out.println("invalid choice");
}
System.out.println("1.BeginInsert 2.EndInsert 3.Position4.Besing Delete 5.End Delete 6.Position Delete 7.Display 8.Exit\n... Enter your choice.");
ch=sc.nextInt();
}while(ch<8);
}
}

