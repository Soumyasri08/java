class Company
{
	int id;
	String name;
	static long salary;

	static void change()
	 {
		salary=salary + 50000;
       }
	Company(int i,String n,long s)
	   {
		id=i;
		name=n;
		salary=s;
	}
	void show()
	    {
		System.out.println("Id of employee is "+id);
		System.out.println("Name of Employee is "+name);
		System.out.println("Salary of Employee is "+salary);
	}
    void display()
            {
              final int x =100;
            //   x+=10;it is not possible
            }

	public static void main(String arg[])

	{
                Company c1 = new Company();
		Company.change();
		Company c2=new Company(101,"Prerana",200000);
		Company c3=new Company(102,"Karishma",150000);

		c1.display();
		c2.show();
		c3.show();
	}
}
