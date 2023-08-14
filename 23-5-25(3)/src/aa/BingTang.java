package aa;

public class BingTang extends TiaoLiao {
	Beverage beverage;

	public BingTang(Beverage b) {
		beverage = b;
	}

	public String getDescription() {
		return beverage.getDescription() + "¼Ó±ùÌÇ";
	}

	public double price() {
		if (getCapacity() == Beverage.SMALL)
			return 0.5 + beverage.price();
		if (getCapacity() == Beverage.MEDIUM)
			return 1 + beverage.price();
		if (getCapacity() == Beverage.LARGE)
			return 1.5 + beverage.price();
		else
			return 0;
	}

}