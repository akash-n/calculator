package unit_2;



//this is for normal method exexution
public class methods {

	public int add(int s, int b,int c) {
		
		int d=s+b+c;
		return d;
		
	}
	public static void main(String[] args) {
		methods a=new methods();
		int answer=a.add(25,32,1);
		System.out.println(+answer);
		

	}

}
