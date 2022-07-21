package unit1;
import java.util.Scanner;
public class typecasting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the character : ");
        char a=s.next().charAt(0);
        System.out.println("for implicit Type casting: ");
        int b = a;
        System.out.println("value as int b: "+b);
        float c =a ;
        System.out.println("value as float c: "+c);
        double d=a;
        System.out.println("value as double d: "+d);
        long l=a;
        System.out.println("value as long l: "+l);
        
        System.out.println("/n ");
        
        System.out.println("for explixit casting: ");
        double g=s.nextDouble();
        int h=(int)g;
        char m=(char)g;
        System.out.println("value as double g: "+g);
        System.out.println("value as int h: "+h);
        System.out.println("value as char m: "+m);
        
        
        
        
        
	}

}
