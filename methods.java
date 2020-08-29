import java.util.*;
class m
{

String name;
int age;

void info()
{

System.out.println("name:" +name+ " and " + "age :" + age);

}
void sayHello()
{
System.out.println("Hello");
}
}

class methods
{
public static void main(String args[])
{

methods person = new methods();

person.name = "sreeja";
person.age = 20;
person.sayHello();
person.info();

}
}
