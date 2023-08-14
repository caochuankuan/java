package aa;

public class Milk extends TiaoLiao {

	Beverage beverage;

	public Milk(Beverage b) {
		beverage = b;
	}

	public String getDescription() {
		return beverage.getDescription() + "¼ÓÅ£ÄÌ";
	}

	public double price() {
		if (getCapacity() == Beverage.SMALL)
			return 1 + beverage.price();
		if (getCapacity() == Beverage.MEDIUM)
			return 1.5 + beverage.price();
		if (getCapacity() == Beverage.LARGE)
			return 2 + beverage.price();
		else
			return 0;
	}
}