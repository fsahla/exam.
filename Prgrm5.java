import java.util.*;
class Prgrm5
{
 public static void main(String[] args)
 {
   Double r,area,perimeter;
   Scanner input=new Scanner(System.in);
   System.out.println("enter the radius of the circle:");
   r=input.nextDouble();
   area=Math.PI*r*r;
   perimeter=2*Math.PI*r;
   System.out.println();
   System.out.println("Area of the circle =" +area);
   System.out.println("perimeter of the circle ="+perimeter);
   }
}