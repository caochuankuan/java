package aa;

public class BeverageHouse {

	public BeverageHouse() {
	}

	public static void main(String[] args) {
		Beverage b1 = new JuHuaCha("中杯菊花茶");
		b1.setCapacity(Beverage.MEDIUM);
		System.out.println(b1.getDescription() + "价格：" + b1.price());

	}

}