package phase1_assisted_project;
class Parent{    
	  void msg() throws Exception {  
	    System.out.println("MAKER method");  
	  }

	public void show() {
		 System.out.println("MAKER method");  
		
	}

	

	 
	}    
	    
	public class Exception_handling extends Parent {    
	  void msg(Object Parent)throws Exception { 
		  
		  super.show();
	    System.out.println("NEW NEW method");  
	  }    
	    
	  

	public static void main(String args[]){    
	   Parent p = new Exception_handling();    
	     
	   try {    
	   p.msg();    
	   }  
	   catch(Exception e) {}    
	  }}    
