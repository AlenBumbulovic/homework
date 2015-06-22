package ba.bitcamp.tasks;

public class Employee {
	
	private String name;
	private String gender;
	private double monthSalary;
	public Employee(String name, String gender, double monthSalary) {
		super();
		this.name = name;
		this.gender = gender;
		this.monthSalary = monthSalary;
	}
	/**
	 * A method that returns the name of the employee
	 * @return the name of the employee
	 */
	public String getName(){
		return name;
	}
	/**
	 * a method that returns the gender of the employee
	 * @return the gender of the employee
	 */
	public String getGender(){
		return gender;
	}
	/**
	 * a method that sets the monthly salary of the employee
	 * @param salary - the salary
	 */
	public void setMonthSalary(double salary){
		monthSalary += salary;
	}
	/**
	 * 
	 * @return month salary of an employee
	 */
	public double getMonthSalary() {
		return monthSalary;
	}
	



}
