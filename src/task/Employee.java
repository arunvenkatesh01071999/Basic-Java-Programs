package task;

public class Employee {

	private String id;
	private String name;
	private String grade;
	private int salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String id, String name, String grade, int salary) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

}
