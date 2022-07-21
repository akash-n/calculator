package unit_2;

import java.util.Scanner;

public class Call_byvaluemethod {
	int value=2245;
	int operation(int value) {
		value=value*1000/20;
		return(value);
		
	}
	
	

	public static void main(String[] args) {
		Call_byvaluemethod x=new Call_byvaluemethod();
		System.out.println("value before: "+x.value);
		x.operation(150);
		System.out.println("value after: "+x.value);
	}

}
