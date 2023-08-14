class people{
	String name;
	people(String n){
		this.name=n;
	}
	String getname(){
		return name;
	}
}
class teacher extends people{
	String department;
	void setDepartment(String department){
		this.department=department;
	}
	teacher(String n,String dp){
		super(n);
		this.department=dp;
	}
	void getdp(){
		System.out.println("department:"+department);
	}
}
class teacherAdviser extends teacher{
	String level;

	teacherAdviser(String n, String dp,String level) {
		super(n, dp);
		this.level=level;
	}

	String getlevel(){
		return this.level;
	}
	
}
public class jichenglianxi{
	public static void main(String[] args){
		people t1=new people("yifeng");
		System.out.println("=====================");
		System.out.println("name:"+t1.getname());
		System.out.println("=====================");
		teacher t2=new teacher("yifeng","tuanwei");
		t2.getdp();
		t2.setDepartment("xueshenghui");
		System.out.println("department:"+t2.department);
		System.out.println("=====================");
		teacherAdviser t3=new teacherAdviser("yifeng","tuanwei","bodao");
		System.out.println("level:"+t3.getlevel());
	}
}