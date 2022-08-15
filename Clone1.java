import java.lang.*;

class Employee implements Cloneable
{
	public int EmployeeID;
	public String Ename;
	public int Salary;
	
	public Employee(int id, String str, int no)
	{
		this.EmployeeID=id;
		this.Ename=str;
		this.Salary=no;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
	
	
class Clone1
{
	public static void main(String args[])throws Exception
	{
		Employee eobj=new Employee(11, "Shree",50000);
		System.out.println("EmployeeID:"+eobj.EmployeeID+" Name:"+eobj.Ename+" Salary:"+eobj.Salary);
		Employee eobjX=(Employee)eobj.clone();
		System.out.println("EmployeeID:"+eobjX.EmployeeID+" Name:"+eobjX.Ename+" Salary:"+eobjX.Salary);
		eobj.Ename="Shubham";
		System.out.println("EmployeeID:"+eobjX.EmployeeID+" Name:"+eobjX.Ename+" Salary:"+eobjX.Salary);
		
	}
}