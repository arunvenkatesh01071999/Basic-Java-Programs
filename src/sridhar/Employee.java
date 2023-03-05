package sridhar;

public class Employee {

	String id;
	String name;
	int salary;
	public String toString()
	{
		return " "+this.id +"- "+this.name+"- "+this.salary;
	}
	public  Employee(String id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
