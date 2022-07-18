class Seasoncase{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter Month");
int month=scn.nextInt();


switch(month)
{ 
   case 1:
   case 12:
   case 11:
         System.out.println("Winter Season");
         break;
   case 4:
   case 5:
   case 6:
         System.out.println("Summer Season");
         break;
   case 7:
   case 8:
   case 9:
         System.out.println("Rainy Season");
         break;

default:
         System.out.println("Invalid inpiut");
}
}
}