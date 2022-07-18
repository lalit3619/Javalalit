class Methodparam3{

private static void title(String Name,int age)//Default methgod
{
System.out.println("Name:-"+Name+",Age:-"+age);

}
private static void title2(String title,double price)//Default methgod
{
System.out.println("Title:-"+title+",Price:-"+price);
}
public static void main(String[] args)
{
System.out.println("Main starts");
title("Neha",32);
title2("Soap",36.63);
java.util.Scanner scn=new java.util.Scanner(System.in);

System.out.println("Enter the title");
String title=scn.next();

System.out.println("Enter the price");
double d=scn.nextDouble();
title2(title,d);

System.out.println("Main Ends");

}
}

