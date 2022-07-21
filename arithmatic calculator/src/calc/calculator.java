package calc;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		char operation;
		Scanner s=new Scanner(System.in);
		System.out.println("Choose an operation: add,sub,mul,div or mod:");
	    operation = s.next().charAt(0);
		System.out.println("Enter the first num:  ");
		 double a = s.nextDouble();
		System.out.println("Enter the second num:  ");
		double  b=s.nextDouble();
		s.close();
		double result;
		
		switch(operation) {
		// performs addition between numbers
	      case '+':
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;
	     // performs subraction between numbers
          case '-':
	        result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;
	     // performs multiplication between numbers
	        case '*':
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;
	     // perform division between numbers
	       case '/':
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;
	     // performs modulus function  between numbers i.e get reminders
	       case '%':
	        result = a % b;
	        System.out.println(a + " % " + b + " = " + result);
	        break;
	       default:
               System.out.printf("You have entered wrong operator");
               return;

	
		}
		
}}
