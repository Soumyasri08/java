import java.util.Scanner;
class loop3
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("choose a number from 1 - 3:");
int n= sc.nextInt();
switch(n)
{
case 1:
System.out.println("Apple");
break;
case 2:
System.out.println("Mango");
break;
case 3:
System.out.println("Orange");
break;
default:
System.out.println("choose from 1,2,3");

}
}
}

