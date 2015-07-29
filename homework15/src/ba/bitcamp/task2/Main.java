package ba.bitcamp.task2;

public class Main {

	public static void main(String[] args) {
	
		Animal a1 = new Animal("Cow", 1, 1);
		Animal a2 = new Animal("Owl", 2, 3);

		//Calling methods from class Animal
		a1.printStatus();
		a2.printStatus();
		Animal.cycleDayNight(); 
		Animal.setAmountOfWater(3);
		a1.printStatus();
		a2.printStatus();

	}

}
