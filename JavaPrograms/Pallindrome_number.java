class Pallindrome_number
{
public static void main(String[] args)
   {
 java.util.Scanner scn=new java.util.Scanner(System.in);
  System.out.println(" Enter The Number");
    int n=scn.nextInt();
     int p=n;
      int sum=0;
     while(n>0)
	{
	 int r=n%10;
	 sum=sum*10+r;
	    n=n/10;
	}
        if(sum==p)
	{
	System.out.println("The Number "+p+" is a pallindrome number");
	}else{
	System.out.println("The Number "+p+" is not a pallindrome number");
	}
}
}