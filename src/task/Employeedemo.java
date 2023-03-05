package task;

import java.util.ArrayList;

public class Employeedemo {

	public static void main(String[] args) 
	{
		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("AT001", "Suresh", "GradeA", 4000));
		employeeList.add(new Employee("AT002", "Arun", "GradeB", 12000));
		employeeList.add(new Employee("AT003", "hari", "GradeC", 60000));

		Employeenum[] employeeArray = Employeenum.values();

		for (Employee empValue : employeeList) {
            boolean bool = false;
            for (Employeenum myEnum : employeeArray) {

            if (empValue.getGrade().equalsIgnoreCase(myEnum.getGrade())
                    && (empValue.getSalary() <= myEnum.getMaxSalary()
                            && empValue.getSalary() >= myEnum.getMinSalary())) {
                bool = true;
            }
        }
        try {
        if (bool) {
            System.out.println( "equal");
        } else {
            throw new  Exception("Invalid Grade/Salary or Exception");
        }
        }catch (Exception  e)
        {
            System.err.println("error" + e.getMessage());
        }

    }

	}

}
