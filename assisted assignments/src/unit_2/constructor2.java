package unit_2;

public class constructor2{    
  
  
public constructor2(int id, java.lang.String name) {
	// TODO Auto-generated constructor stub
  
}  

void display(){String name = null;int id = 0;
System.out.println(id+" "+name);}  

public static void main(String args[]){  
//creating objects and passing values  
constructor2 s1 = new constructor2(111,"Karan");  
constructor2 s2 = new constructor2(222,"Aryan");  

s1.display();  
s2.display();  
}  
}  
