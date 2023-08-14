class car1_extends{
	public static void main(String[] args){
		car1 c1 = new car1();
		c1.car("audi",1,"blue",99,"A");
		c1.print_car();
		c1.price = "$9999";
		c1.feature = "1.Little Black. 2.two and a half years";
		System.out.println("the price is:"+c1.price);
		System.out.println("the feature is:"+c1.feature);
	}
}

class car{
	private String brand;
	int gas;
	String color;
	int sum;
	String xinghao;
	void car(String brand_u,int gas_u,String color_u,int sum_u,String xinghao_u){
		brand=brand_u;
		gas=gas_u;
		color=color_u;
		sum=sum_u;
		xinghao=xinghao_u;
	}
	void print_car(){
		System.out.println("brand:"+brand+"\ngas:"+gas+"\ncolor:"+color+"\nsum:"+sum+"\nxinghao:"+xinghao);
	}
}

class car1 extends car{
	String price;
	String feature;
}

