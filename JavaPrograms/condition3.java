class condition3{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the Fisrt Number");
int a=scn.nextInt();
System.out.println("Enter the Second Number");
int b=scn.nextInt();
if(a>b)
{
System.out.println("a is bigger number than b");
}
else if(a<b)
{
System.out.println("a is smaller than b");
}
else{
System.out.println("a is equal to b");
}
}
}