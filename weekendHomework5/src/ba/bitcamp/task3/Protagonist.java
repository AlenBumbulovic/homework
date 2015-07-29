package ba.bitcamp.task3;

import ba.bitcamp.task1.Character;
import ba.bitcamp.task2.Event;
import ba.bitcamp.task2.Goal;

public class Protagonist extends Character {
	
	private Goal characterGoal;
	private Character[] friends = {null, null, null};
	private Character enemy = null;
	
	public static final int MAX_FRIENDS = 3;

	public Protagonist(int gender, boolean isAlive, boolean isCapable,
			Goal characterGoal, Character[] friends, Character enemy) {
		super(gender, isAlive, isCapable);
		this.characterGoal = characterGoal;
		this.friends = friends;
		this.enemy = enemy;
	}

	public Goal getCharacterGoal() {
		return characterGoal;
	}

	public void setCharacterGoal(Goal characterGoal) {
		this.characterGoal = characterGoal;
	}

	public Character[] getFriends() {
		return friends;
	}

	public void setFriends(Character[] friends) {
		this.friends = friends;
	}

	public Character getEnemy() {
		return enemy;
	}

	public void setEnemy(Character enemy) {
		this.enemy = enemy;
	}
	
	// Adding allies to help protagonist character
	
	public void addAllies(Character ally){
		for(int i = 0; i < friends.length; i++){
			if(friends[i] == null){
				friends[i] = ally;
				break;
			}else if (friends[friends.length - 1] != null){
				System.out.println("Can't add more allies");
			}
		}
		
	}
	

	// This method will simulate actions between two characters
	public void attainGoal() {
		int chance = 0;
		// Generating random number between 0-100 to compare with chances to win
		int randNum = (int) (Math.random() * 100);
		// If character is capable, chances will grow by 40%
		if (isCapable() == true) {
			chance = 40;
		}
		// If main enemy is capable, chances will be lowered by 30%
		if (enemy.isCapable() == true) {
			chance -= 30;
		}
		// Every ally will increase win chance by 20%
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				break;
			} else if (friends[i].isCapable() == true) {
				chance += 20;
			}
		}

		// If game mode is HARD, chances will be lowered by 20%, if impossible
		// chances will be 0%
		if (characterGoal.getStoryDifficulty() == Goal.HARD) {
			chance -= 20;
		} else if (characterGoal.getStoryDifficulty() == Goal.IMPOSSIBLE) {
			chance = 0;
		}
		// If chances goes under 0, we will set value to 0, if it goes upper
		// 100, we will set value on 100
		if (chance < 0) {
			chance = 0;
		} else if (chance > 100) {
			chance = 100;
		}
		System.out.println(chance);
		// If our character is dead, game over.
		if (isAlive() != true) {
			System.out.println("Character is dead!");
		} else {
			// If our chance is greater than random number that goes between 0
			// and 100
			// Character would succeed in his goal.
			if (chance > randNum) {
				if (characterGoal.getReachGoal() == Event.DEFEAT) {
					System.out.println("Character succeded. He defeated: "
							+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.FRIENDSHIP) {
					System.out
							.println("Character succeeded. He became friend with: "
									+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.LOVE) {
					System.out
							.println("Character succeeded. He fell in love with: "
									+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.REVENGE) {
					System.out.println("Character succeeded. He got his revenge: "
							+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.MANIPULATION) {
					System.out.println("Character succeeded. He manipulates: "
							+ enemy.getName());

				}
			//If chance is lower than random number, character would be defeated.
			} else if (chance <= randNum) {
				if (characterGoal.getReachGoal() == Event.DEFEAT) {
					System.out.println("Character failed to defeat: "
							+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.FRIENDSHIP) {
					System.out
							.println("Character failed to become friend with: "
									+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.LOVE) {
					System.out
							.println("Character failed to fall in love with: "
									+ enemy.getName());
				} else if (characterGoal.getReachGoal() == Event.REVENGE) {
					System.out.println("Character failed in revenge.: ");
				} else if (characterGoal.getReachGoal() == Event.MANIPULATION) {
					System.out.println("Character failed to manipulate: "
							+ enemy.getName());

				}
			}
		}
	}

}
