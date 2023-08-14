class student{
	int sno,id,telephone;
	String sname,classname;
	public student(int sno,String sname,String classname,int id,int telephone){
		this.sno=sno;
		this.sname=sname;
		this.classname=classname;
		this.id=id;
		this.telephone=telephone;
	}
	void settelephone(int tele){
		this.telephone=tele;
	}
	void getsno(){
		System.out.println("sno:"+this.sno);
	}
	void getname(){
		System.out.println("name:"+this.sname);
	}
	void getclassname(){
		System.out.println("classname:"+this.classname);
	}
	void gettelephone(){
		System.out.println("telephon:"+this.telephone);
	}
	
}
class smanager extends student{
	String charge;
	String department;
	public smanager(int sno,String sname,String classname,int id,int telephone,String charge,String department){
		super(sno,sname,classname,id,telephone);
		this.charge=charge;
		this.department=department;
	}
}

public class zuoye {
	public static void main(String[] args){
		smanager aa=new smanager(21103,"chuankuan","jiying",1111,10086,"zhuxi","yuantuanwei");
		aa.getsno();
		aa.getname();
		aa.getclassname();
		aa.gettelephone();
		aa.settelephone(10010);
		aa.gettelephone();
		aa.charge="zhuxi";
		aa.department="xueshenghui";
		System.out.println("charge:"+aa.charge+"\ndepartment:"+aa.department);
	}
}
