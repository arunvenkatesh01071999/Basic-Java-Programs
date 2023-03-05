package task;

public enum Employeenum {
	GRADEA("GradeA", 5000, 10000),
	GRADEB("GradeB", 11000, 50000),
	GRADEC("GradeC", 50000, 100000);

	private String grade;
	private int minSalary;
	private int maxSalary;

	public String getGrade() {
		return grade;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	Employeenum(String grade, int minSalary, int maxSalary) {
		this.grade = grade;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

}
