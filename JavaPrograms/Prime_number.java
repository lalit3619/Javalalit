class Prime_number
{
public static void main(String[] args)
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
  System.out.println(" Enter The Number");
    int n=scn.nextInt();
     int p=n;
     int a=1;
  for(int i=2;i<n;i++)
	{
          if(n%i==0)
            {
 	     a=0;
              break;
	    }
	 }
       if(a==1)
	{
       System.out.println("The Number "+p+" is a prime Number");
        }else
	 {  
         System.out.println("The number "+p+" is not a prime Number");
	 }
  }
}