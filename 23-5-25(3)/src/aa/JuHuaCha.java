package aa;

public class JuHuaCha extends Beverage {

	public JuHuaCha(String desc) {
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