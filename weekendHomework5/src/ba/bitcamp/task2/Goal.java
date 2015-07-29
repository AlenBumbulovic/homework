package ba.bitcamp.task2;

import ba.bitcamp.task1.StoryElement;

public class Goal extends StoryElement {

	private int storyDifficulty;
	private int reachGoal;
	private Character character;

	// story difficulty
	public static final int EASY = 1;
	public static final int HARD = 2;
	public static final int IMPOSSIBLE = 3;

	public Goal(String name, int storyDifficulty, int reachGoal,
			Character character) {
		super(name);
		this.storyDifficulty = storyDifficulty;
		this.reachGoal = reachGoal;
		this.character = character;
	}

	// getters and setters
	public int getStoryDifficulty() {
		return storyDifficulty;
	}

	public void setStoryDifficulty(int storyDifficulty) {
		this.storyDifficulty = storyDifficulty;
	}

	public int getReachGoal() {
		return reachGoal;
	}

	public void setReachGoal(int reachGoal) {
		this.reachGoal = reachGoal;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	// basic toString method
	@Override
	public String toString() {
		return "Goal [storyDifficulty=" + storyDifficulty + ", reachGoal="
				+ reachGoal + ", character=" + character + "]";
	}

}
