package ba.bitcamp.task1;

public class Main {

	public static void main(String[] args) {

		Cashbox c = new Cashbox("Moja kasa");

		System.out.println(c.cashboxBalance());
		c.addMoney(30);
		System.out.println(c.cashboxBalance());
		c.addMoney(100);
		System.out.println(c.cashboxBalance());
		c.removeAllMoney();
		System.out.println(c.cashboxBalance());

	}

}
