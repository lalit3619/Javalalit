class sum_of_digit_of_number
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
  	sum=sum+r;
  	n=n/10;
	}
   
   System.out.println("The sum of digit of the number "+p+" is "+sum);
   }
}
