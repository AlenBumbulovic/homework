package ba.bitcamp.tasks;

import java.util.Arrays;

public class Firm {
	
	private String name;
	private Employee director;
	private Employee[] workers;

	public Firm(String name, Employee director, Employee[] workers) {
		super();
		this.name = name;
		this.director = director;
		this.workers = workers;
	}
	/**
	 * 
	 * @return name of the firm
	 */

	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return number of employees in the firm
	 */

	public int numberOfEmployees() {
		return workers.length;
	}
	/**
	 * 
	 * @return the sum of all salaries in the firm
	 */

	public double getAllSalary() {
		int salary = 0;

		for (int i = 0; i < workers.length; i++) {

			salary += workers[i].getMonthSalary();
		}
		return salary;
	}
	/**
	 * counts all women working in the firm
	 * @return number of womens
	 */

	public int getNumOfWomen() {
		int counter = 0;

		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getGender().equals("female")) {
				counter++;
			}

		}
		return counter;
	}
	/**
	 * increases the salary
	 * @param salary 
	 */
	public void increaseSalary(double salary){
		
		for(int i = 0; i < workers.length; i++){
			workers[i].getMonthSalary() += salary;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Firm [name=" + name + ", director=" + director + ", workers="
				+ Arrays.toString(workers) + "]";
	}


}
