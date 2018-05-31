package air;

public class EmployeeDetail {
	public static void main(String[]args)
	{
		Employee e1=new Employee();
		e1.setname("name");
		e1.setsalary(10000);
		Employee e2=new Employee();
		e2.setname("name");
		e2.setsalary(100000);
		double salary=e1.getsalary();
		salary=salary*1.1;
		e1.setsalary(salary);
		System.out.println(e1.getsalary());
	}

}
