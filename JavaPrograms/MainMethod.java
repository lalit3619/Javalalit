class MainMethod{

public static void main(String[] args)
{
System.out.println("Main Starts");
main("Testing");
main();
System.out.println("Main Ends");
}


public static void main(String args)
{
System.out.println("Main method with String args="+args);

}
public static void main()
{
System.out.println("Main Method Without any args");
}
}