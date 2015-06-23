package ba.bitcamp.task1;
/**
 * 
 * @author Alen Bumbulovic
 *A class that describes an element in the action of the story
 */
public abstract class StoryElement {
	
	private String name;

	public StoryElement(String name) {
		super();
		this.name = name;
	}

	public StoryElement() {
		this.name = "STElement";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StoryElement [name=" + name + "]";
	}
	
	
	
	
	
	

}
