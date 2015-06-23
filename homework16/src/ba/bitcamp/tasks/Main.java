package ba.bitcamp.tasks;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee("Direktor", "female", 2000);
		Employee e1 = new Employee("Worker", "male", 1800);
		Employee e2 = new Employee("Worker1", "male", 1700);
		Employee e3 = new Employee("Worker3", "female", 1770);
		Employee e4 = new Employee("Worker4", "male", 1600);

		Firm f = new Firm("BitCamp", e, new Employee[] { e2, e2, e3, e4 });

		System.out.println("The number of the employees in the firm is: "
				+ f.numberOfEmployees() + " not including the director");
		System.out
				.println("The number of female workers in the firm(not including the director) is: "
						+ f.getNumOfWomen());
		System.out.println("Sum of all salaries in the firm; "
				+ f.getAllSalary());
		f.increaseSalary(200);
		System.out.println("Sum of all salaries in the firm; "
				+ f.getAllSalary());

	}

}
