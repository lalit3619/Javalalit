class Multiplemethod
//Method Overloadding in java
{
public static void add(int a, int b)
{
System.out.println("Sum="+(a+b));
}

public static void add(int a, int b,int c)
{
System.out.println("Sum="+(a+b+c));
}
public static void add(double d1,double d2)
{
System.out.println("Sum="+(d1+d2));//diffrent type parameter
}
public static void main(String[] args)
{
System.out.println("Main starts");
add(34,54);
add(10,20,500);
add(233.20,5654.23);
System.out.println("Main ends");
}

}