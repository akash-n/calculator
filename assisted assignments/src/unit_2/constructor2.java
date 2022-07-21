package unit_2;

public class constructor2{  int id;  
String name;  
//creating a parameterized constructor 
constructor2(int i,string){  
id = i;  
name = string;  
}  
  
void display(){System.out.println(id+" "+name);}  

public static void main(String args[]){  
//creating objects and passing values  
constructor2 s1 = new constructor2(111,"Karan");  
constructor2 s2 = new constructor2(222,"Aryan");  

s1.display();  
s2.display();  
}  
}  
