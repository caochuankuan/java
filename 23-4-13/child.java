public class child extends parent{
	private String sex;
	child(String name,int age,String sex){
		super(name,age);
		System.out.println("child say:I am "+name+",I was "+age+",sex is "+sex);
	}
}