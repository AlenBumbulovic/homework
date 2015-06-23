package ba.bitcamp.task1;
/**
 * 
 * @author Alen Bumbulovic
 *A class that describes one character in the story
 */
public class Character extends StoryElement {
	
	private int gender;
	private boolean isAlive;
	private boolean isCapable;
	
	public static final int GENDER_MALE = 1;
	public static final int GENDER_FEMALE = 2;
	
	public Character(int gender, boolean isAlive, boolean isCapable) {
		super();
		this.gender = gender;
		this.isAlive = true;
		this.isCapable = isCapable;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isCapable() {
		return isCapable;
	}

	public void setCapable(boolean isCapable) {
		this.isCapable = isCapable;
	}
	/**
	 * This method kills the character
	 * 
	 */
	public boolean killCharacter(){
		if(isAlive == true){
			
		}return isAlive = false;
	}
	/**
	 * This method turns an unfit character into capable
	 */
	public boolean turnCapable(){
		if(isCapable == false){
			
		}return isCapable = true;
	}
	

}
