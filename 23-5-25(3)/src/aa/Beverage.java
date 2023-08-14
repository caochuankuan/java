package aa;

public abstract class Beverage {

	public Beverage() {
	}

	public final static int SMALL = 1;
	public final static int MEDIUM = 2;
	public final static int LARGE = 3;
	protected String description = "yinliao";
	private int capacity = SMALL;

	public String getDescription() {
		return description;
	}

	public void setCapacity(int s) {
		capacity = s;
	}

	public int getCapacity() {
		return capacity;
	}

	public abstract double price();
}