package ba.bitcamp.task1;

public class Cashbox {

	private String name;
	private int balance;

	public Cashbox(String name) {

		this.name = name;
		this.balance = 0;
	}

	/**
	 * A method that adds money to the cashbox
	 * 
	 * @param coins
	 */
	public void addMoney(int money) {
		balance += money;
	}

	/**
	 * A method that removes all the money from the cashbox
	 */
	public int removeAllMoney() {
		while (balance != 0) {
			balance--;

		}
		return balance;
	}

	/**
	 * This method prints the balance of the cashbox
	 
	 */
	public int cashboxBalance() {
		if (balance == 0) {
			System.out.println("It's empty");
		}
		if (balance >= 1 && balance < 20) {
			System.out.println("There's some, but not much");
		}
		if (balance >= 20 && balance <= 100) {
			System.out.println("There's some");
		}
		if (balance >= 101) {
			System.out.println("There's a lot");

		}

		return balance;

	}

}
