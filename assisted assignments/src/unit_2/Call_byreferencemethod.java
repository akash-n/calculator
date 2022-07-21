package unit_2;

public class Call_byreferencemethod {
	public void area(int l,int b,int h) {
		System.out.println("Area of rectangle= "+(l*b*h));
	}
public void speed (int d,int t) {
	System.out.println("time taken to cover rectangular track area: "+(d/t));
}
public void race(int area,int speed) {
	System.out.println("then track coverage: "+(area/speed));
}
	public static void main(String[] args) {
		Call_byreferencemethod man=new Call_byreferencemethod();
		man.area(32, 11, 120);
		man.speed(100,2);
        man.race(1231, 21);
		
	}

}
