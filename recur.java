class recur
{
public static void main(String args[])
{

System.out.println(fact(5));
}

private static int fact(int val)
{

if(val==1)
{
return 1;
}
else

return fact(val-1)*val;

}

}

