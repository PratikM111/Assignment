import java.util.*;
class var_demo4
{
	public static void main(String args[])
    {
	  int num1,num2, sum;
	  double num3;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter First Number");
	  num1=sc.nextInt();
	  System.out.println("Enter Second Number");
	  num2=sc.nextInt();
	  sum=num1+num2;
	  System.out.println("The add is = "+sum);
	  System.out.println("Enter Number for double");
	  num3=sc.nextDouble();
	  System.out.println("The add is = "+sum);
    }
}