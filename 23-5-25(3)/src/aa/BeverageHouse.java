package aa;

public class BeverageHouse {

	public BeverageHouse() {
	}

	public static void main(String[] args) {
		Beverage b1 = new JuHuaCha("�б��ջ���");
		b1.setCapacity(Beverage.MEDIUM);
		System.out.println(b1.getDescription() + "�۸�" + b1.price());

	}

}