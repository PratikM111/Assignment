import java.util.*;
class calc
{
public static void main(String args[])
{
int num1, num2, sum,sub,mul,div, mod;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First num");
num1=sc.nextInt();
System.out.println("Enter Second num");
num2=sc.nextInt();
sum=num1+num2;
System.out.println("Addition is = "+sum);

sub=num1-num2;
System.out.println("substraction is = "+sub);

mul=num1*num2;
System.out.println("Multiplication is = "+mul);

div=num1/num2;
System.out.println("Division is = "+div);

mod=num1%num2;
System.out.println("Mod is = "+mod);
}
}