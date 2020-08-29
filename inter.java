interface draw
{
void print();
}
class rectangle implements draw
{
void print()
{
System.out.println("This is rectangle");
}
}
class square implements draw
{
public void print()
{
System.out.println("This is square");
}
}
class inter
{
public static void main(String args[])
{
draw d = new square();
d.print();

draw e = new rectangle();

d.print();
}
}

