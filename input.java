import java.util.Scanner;
class input
{
public static void main(String args[])
{
//we use scanner to take user input

Scanner sc = new Scanner(System.in);
System.out.println("Enter a name");
String name=sc.nextLine();
System.out.println("Entered name :" +name);
int age = sc.nextInt();
System.out.println("Entered age:" + age);
}
}
