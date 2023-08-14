import java.util.*;
public abstract class animal2{
	private int legnum;
	private movebehavior movebehavior;
	public abstract void makesound();
	animal2(int l){legnum=1;}
	public int getlegnum(){ return legnum;}
	
	public void setmovebehavior(movebehavior m){
		movebehavior=m;
		}
		
		public void performmove(){
			movebehavior.move();
			}
		
	
	}