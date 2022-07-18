class Whileloop{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter Age");
int Age=scn.nextInt();
while(Age>=18)
{
System.out.println("Eligible to vote");
Age--;
}
}
}
