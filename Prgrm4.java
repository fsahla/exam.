import java.util.*;
class Prgrm4
{
 public static void main(String[] args)
 {
   Scanner input=new Scanner(System.in);
   System.out.println("enter your first number:");
   int num1=input.nextInt();
   System.out.println("enter your second number:");
   int num2=input.nextInt();
   int product=num1*num2;
   System.out.println();
   System.out.println("product=" +product);
   }
}