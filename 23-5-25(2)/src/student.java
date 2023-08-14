public class student {
	public static void main(String[] args){
		shengwu sw,dw,r;
		sw = new shengwu();
		dw = new dongwu();
		r = new ren();
		
		System.out.println("===shengwu===");
		sw.use(new breathe());
		
		System.out.println("\n===dongwu===");
		dw.use(new breathe());
		dw.use(new eat());
		dw.use(new sleep());
		
		System.out.println("\n===ren===");
		r.use(new breathe());
		r.use(new eat());
		r.use(new sleep());
		r.use(new study());
		r.use(new think());
	}
}
