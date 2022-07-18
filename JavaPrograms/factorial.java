class factorial {

public static void main(String[] args)
  {
   java.util.Scanner scn=new java.util.Scanner(System.in);
	System.out.println("Enter 1st number");
	int a=scn.nextInt();
	int fact=1;
		for(int i=1;i<=a;i++)
		{
		fact=fact*i;
		}
	System.out.println("THe factorial of " +a+ " is "+fact);
   }
}