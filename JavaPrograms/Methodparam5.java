class Methodparam5{

private static String title(String Name,int age)//Default methgod
{
return "Name:-"+Name+",Age:-"+age;

}
private static void title2(String title,double price)//Default methgod
{
System.out.println("Title:-"+title+",Price:-"+price);
}
static int m1(int a,int b){
int sum=a+b;
return sum;
}
public static void main(String[] args)
{
System.out.println("Main starts");
System.out.println(title("Neha",32));
title2("Soap",36.63);
java.util.Scanner scn=new java.util.Scanner(System.in);

System.out.println("Enter the title");
String title=scn.next();

System.out.println("Enter the price");
double d=scn.nextDouble();
title2(title,d);
int a=m1(57,45);
System.out.println("Sum of no."+a);


System.out.println("Main Ends");

}
}
