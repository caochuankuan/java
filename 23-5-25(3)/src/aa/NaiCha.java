package aa;

public class NaiCha extends Beverage {

	public NaiCha(String desc) {
		description = desc;
	}

	public double price() {
		if (getCapacity() == Beverage.SMALL)
			return 6;
		else if (getCapacity() == Beverage.MEDIUM)
			return 8;
		else if (getCapacity() == Beverage.LARGE)
			return 10;
		else
			return 0;
	}

}