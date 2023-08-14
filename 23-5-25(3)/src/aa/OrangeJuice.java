package aa;

public class OrangeJuice extends Beverage {

	public OrangeJuice(String desc) {
		description = desc;
	}

	public double price() {
		if (getCapacity() == Beverage.SMALL)
			return 5;
		else if (getCapacity() == Beverage.MEDIUM)
			return 7;
		else if (getCapacity() == Beverage.LARGE)
			return 9;
		else
			return 0;
	}

}