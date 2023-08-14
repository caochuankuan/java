import java.util.*;
public class animaltest{
	public static void main(String[] agrs){
		animal2 dog,cat,rabbit,duck,goose;
		dog=new dog(4);
		cat=new cat(4);
		rabbit=new rabbit(4);
		duck=new duck(2);
		goose=new goose(2);
		dog.setmovebehavior(new fourlegmove());
			cat.setmovebehavior(new fourlegmove());
				duck.setmovebehavior(new fourlegmove());
					goose.setmovebehavior(new fourlegmove());
					dog.performmove();
					cat.performmove();
					duck.performmove();
					goose.performmove();
		}
	}