class car{
	private String brand;
	int gas;
	String color;
	int sum;
	String xinghao;
	car(String brand_u,int gas_u,String color_u,int sum_u,String xinghao_u){
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

class car1{
	public static void main(String[] args){
		car c1 = new car("audi",1,"blue",99,"A");
		c1.print_car();
	}
}