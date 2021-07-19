import java.util.*; 
class treemap
{
 public static void main(String args[]) { HashMap<Integer,String> x=new HashMap<Integer,String>();
 TreeMap<Integer,String> t=new TreeMap<Integer,String>(x);
  Scanner sc=new Scanner(System.in); 
  int n; int key; String value;
   System.out.println("enter n value");
    n=sc.nextInt(); 
    for(int i=0;i<n;i++) 
    { 
    key=sc.nextInt(); 
    value=sc.next(); 
    t.put(key,value); 
    } 
      for (Map.Entry<Integer, String> i :t.entrySet()) 
        { System.out.println(i.getKey() + " " + i.getValue());
        }
     } }
