import java.util.*;
 class prefix
  { public static void main(String args[]) 
  {
  	 Scanner sc=new Scanner(System.in); 
  int q=sc.nextInt();
   int n=50;
    int[] prefix=new int[n+1]; 
    prefix[0]=0; 
    prefix[1]=3;
    for(int i=2;i<n+1;i++) 
    { 
     prefix[i]=prefix[i-1] +3*i;
        }
         while(q>0)
    { 
    int num=sc.nextInt();
     System.out.println(prefix[num]);
     
     q--;
    }
     } }