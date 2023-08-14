class student{
	float height,weight,age;
	String name,sex,stdno;
	void setvalue1(float height,float weight,float age){
		this.height=height;
		this.weight=weight;
		this.age=age;
	}
	void setvalue2(String name_u,String sex_u,String stdno_u){
		name=name_u;
		sex=sex_u;
		stdno=stdno_u;
	}
	void show1(){
		System.out.println("name:"+name);
		System.out.println("sex:"+sex);
		System.out.println("stdno:"+height);
	}
}

public class student1{
	public static void main(String[] args){
		student ss = new student();
		ss.setvalue1(170,60,18);
		ss.setvalue2("yifeng","nan","2131131103");
		ss.show1();
		System.out.println("weight:"+ss.weight);
	}
}