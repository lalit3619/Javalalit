class switchcasestatment{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter The days");
int days=scn.nextInt();
//syntax of switch case statment
switch(days)
 {
  case 1 :
          System.out.println("Sunday");
          break;
  case 2 :
          System.out.println("monday");
          break;
  case 3 :
          System.out.println("Tuesday");
          break;
  case 4 :
          System.out.println("Wednusday");
          break;
  case 5 :
          System.out.println("Thursday");
          break;
  case 6 :
          System.out.println("Friday");
          break;
  case 7 :
          System.out.println("Saturday");
           break;
  default :
          System.out.println("Number is invalid");
  }
}
}
