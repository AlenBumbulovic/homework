package ba.bitcamp.task2;

public class Animal {
	
	private String name;
	private int active;
	private int water;
	
	private static Integer dayOrNight = 1;
	private static Integer habitat = 1;
	
	public Animal(String name, int active, int water) {
		super();
		this.name = name;
		this.active = active;
		this.water = water;
	}
	
	/**
	 * This method will print animal status
	 */
	public void printStatus() {
		if (active == dayOrNight && water == habitat) {
			System.out
					.println("It's fine. The animal is active and has water.");
		} else if (active != dayOrNight && water == habitat) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else if (active == dayOrNight && water != habitat) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (active != dayOrNight && water != habitat) {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}
	}
	
	/**
	 * This method will change cycles from day to night
	 */
	public static void cycleDayNight() {
		if (dayOrNight == 1) {
			dayOrNight = 2;
		} else {
			dayOrNight = 1;
		}
	}
	/**
	 * This method will set the amount of water
	 * @param w - represents new amount of water
	 */
	public static void setAmountOfWater(int w) {
		if (habitat >= 0 && habitat <= 3) {
			habitat = w;
		}
	}
	
	
	


}
