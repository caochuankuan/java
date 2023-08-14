public class student extends people implements gf{
	private gf gf;
	void setMethods(gf gf1){
		this.gf=gf1;
	}
	void getMethods(){
		gf.breathe();
		gf.eat();
		gf.sleep();
		gf.study();
		gf.think();
	}
}
