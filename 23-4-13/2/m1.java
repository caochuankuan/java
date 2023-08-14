public class m1 extends employee{
	private double bonus;
	public m1(String name,String id,String hireDay,String address,String cellphone,String homephone,double salary,double b){
		super(name,id,hireDay,address,cellphone,homephone,salary);
		bonus=b;
	}
	public Double getsalary(){
		return (super.getsalary()+this.bonus);
	}
	public double getbonus(){
		return bonus;
	}
	public void setbonus(double b){
		bonus=b;
	}
	public void setbonus(double basic,double ration){
		bonus=basic*ration;
	}
}