package java0511;

class mainbord{
	public void usepcicard(pci p){
		p.start();
		p.stop();
	}
}
class soundcard implements pci{
	public void start(){
		System.out.println("Sound Card is Starting...");
	}
	public void stop(){
		System.out.println("Sound Card is Stopping...");
	}
}

interface pci{
	void start();
	void stop();
}

public class Interface{
	public static void main(String[] args){
		mainbord mb = new mainbord();
		soundcard sc = new soundcard();
		mb.usepcicard(sc);
	}
}
