
import java.lang.*;

class Employee//class Employee extends Object
{
	public String name;
	public int salary;
	public Employee(String str, int no)
	{
		this.name=str;
		this.salary=no;
	}
	public String toString()
	{
		return ("Gammat");//return String
	}
	
}
	
	
class toString1
{
	public static void main(String args[])
	{
		Employee eobj=new Employee("Shree",11000);
		System.out.println(eobj.toString());
	}
}
