public class aa{
	public static void main(String[] args){
		employee a = new employee("yifeng111","03","2023.4.12","lianjiang","10086","1008611",6.66);
		System.out.println("name:"+a.getname());
		System.out.println("id:"+a.getid());
		System.out.println("hireDay:"+a.gethireDay());
		System.out.println("address:"+a.getaddress());
		System.out.println("cellphone:"+a.getcellphone());
		System.out.println("homephone:"+a.gethomephone());
		System.out.println("salary:"+a.getsalary());
	}
}