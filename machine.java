class robo
{
void speak(String text)
{
System.out.println(text);
}
void info(String name,int age)
{
System.out.println("name "+name+",age" +age);
}
}
class machine()
{
public static void main(String args[])
{
machine machine1=new machine();
machine1.speak("Hello");
machine1.info("karthik",30);
}
}
