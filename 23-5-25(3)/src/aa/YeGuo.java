package aa;

public class YeGuo extends TiaoLiao {
	Beverage beverage;

	public YeGuo(Beverage b) {
		beverage = b;
	}

	public String getDescription() {
		return beverage.getDescription() + "¼ÓÒ¬¹û";
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