import java.util.*; 
  class map1
 {
 public static void main(String args[])
 { 
 HashMap<String,Integer> x=new HashMap<String,Integer>(); 
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter n value");
 int n=sc.nextInt();
 String[ ] str=new String[n];
 System.out.print("Enter elements");
 for(int k=0;k<n;k++)
 {str[k]=sc.next();
 }
for(int i=0;i<str.length;i++) 
 {
 if(x.containsKey(str[i])) 
 {
 x.put(str[i],x.get(str[i])+1);
}
else
x.put(str[i],1);
 }
for (Map.Entry<String, Integer> i :x.entrySet()) 
        { 
        if(i.getValue()>2)
        System.out.println(i.getKey() + "=" + i.getValue());
 }
	} 
  }