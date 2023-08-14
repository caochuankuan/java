public class humanresource{
	public static void main(String[] args){
		manager e = new manager("yifeng","2131131103","2021-9","zhanjiang","10086","10010",9999,0);
		e.setbonus(5000);
		System.out.println("===yuangongxinxi===");
		System.out.println("name:"+e.getname());
		System.out.println("id:"+e.getid());
		System.out.println("hireDay:"+e.gethireDay());
		System.out.println("address:"+e.getaddress());
		System.out.println("cellphone:"+e.getcellphone());
		System.out.println("homephone:"+e.gethomephone());
		System.out.println("salary:"+e.getsalary()+"\n");
		
		e.setbonus(5000,1.2);
		System.out.println("===yuangongxinxi===");
		System.out.println("name:"+e.getname());
		System.out.println("id:"+e.getid());
		System.out.println("hireDay:"+e.gethireDay());
		System.out.println("address:"+e.getaddress());
		System.out.println("cellphone:"+e.getcellphone());
		System.out.println("homephone:"+e.gethomephone());
		System.out.println("salary:"+e.getsalary()+"\n");
		
		m1 m = new m1("yifeng","2131131103","2021-9","zhanjiang","10086","10010",9999,0);
		m.setbonus(5000);
		System.out.println("===yuangongxinxi===");
		System.out.println("name:"+m.getname());
		System.out.println("id:"+m.getid());
		System.out.println("hireDay:"+m.gethireDay());
		System.out.println("address:"+m.getaddress());
		System.out.println("cellphone:"+m.getcellphone());
		System.out.println("homephone:"+m.gethomephone());
		System.out.println("salary:"+m.getsalary()+"\n");
		
		m.setbonus(5000,1.2);
		System.out.println("===yuangongxinxi===");
		System.out.println("name:"+m.getname());
		System.out.println("id:"+m.getid());
		System.out.println("hireDay:"+m.gethireDay());
		System.out.println("address:"+m.getaddress());
		System.out.println("cellphone:"+m.getcellphone());
		System.out.println("homephone:"+m.gethomephone());
		System.out.println("salary:"+m.getsalary());
	}
}