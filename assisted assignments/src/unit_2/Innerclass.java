package unit_2;
import java.lang.String;
class localInner2{ 
	
	 void display(){  
	  int value=50;  
	  class Local{  
	   void msg(){System.out.println(value);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  localInner2 obj=new localInner2();  
	  obj.display();  
	 }  }