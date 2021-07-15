import java.util.*;
class add
{
public static void main(String args[])
{
ArrayList<Integer>a=new
ArrayList<Integer>();
ArrayList<Integer>a1=new
ArrayList<Integer>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
a1.add(100);
a1.add(200);
a1.add(300);
a1.add(400);
a1.addAll(a);
Collections.sort(a1);
System.out.println("list a1"+a1);
}
}