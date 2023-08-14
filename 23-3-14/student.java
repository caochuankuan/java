class student{
	float high,weight,age;
	String name,sex,stdno;
	void setvalue1(float h,float w,float a){
		this.high=h;
		this.weight=w;
		this.age=a;
	}
	void setvalue2(String n,String s1,String s2){
		name=n;
		sex=s1;
		stdno=s2;
	}
	void show1(){
		System.out.println("name:"+name);
		System.out.println("sex:"+sex);
		System.out.println("stdno:"+stdno);
	}
}