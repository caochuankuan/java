import java.util.*;
class employee{
	private String name;
	private String id;
	private String hireDay;
	private String address;
	private String cellphone,homephone;
	private double salary;
	
	public employee(String name,String id,String hireDay,String address,String cellphone,String homephone,double salary){
		this.name=name;
		this.id=id;
		this.hireDay=hireDay;
		this.address=address;
		this.cellphone=cellphone;
		this.homephone=homephone;
		this.salary=salary;
	}
	
	public void setaddress(String addr){
		this.address=addr;
	}
	public void setcellphone(String cp){
		this.cellphone=cp;
	}
	public void sethomephone(String hp){
		this.homephone=hp;
	}
	public void setsalary(Double salary){
		this.salary=salary;
	}
	public String getname(){
		return name;
	}
	public String getid(){
		return id;
	}
	public String gethireDay(){
		return hireDay;
	}
	public String getaddress(){
		return address;
	}
	public String getcellphone(){
		return cellphone;
	}
	public String gethomephone(){
		return homephone;
	}
	public Double getsalary(){
		return salary;
	}
	
}