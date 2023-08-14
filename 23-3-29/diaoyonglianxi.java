class overloaddemo{
	int test(){return 0;}
	int test(int a){return a*a;}
	double test(int a,double b){return a*b;}
}

public class diaoyonglianxi{
	public static void main(String[] args){
		float max;
		float x[]={1,2,3,4,5};
		methoddemo y = new methoddemo();
		max = y.findMax(x);
		System.out.println(max);
		overloaddemo v = new overloaddemo();
		System.out.println(v.test());
		System.out.println(v.test(2));
		System.out.println(v.test(2,6));
		System.out.println(v.test(2,v.test(2)));
	}
}

class methoddemo{
	float findMax(float arr[]){
		int i;
		float temp;
		temp = arr[0];
		for(i=1;i<arr.length;i++){
			if(arr[i]>temp){
				temp=arr[i];
			}
		}
		return temp;
	}
}