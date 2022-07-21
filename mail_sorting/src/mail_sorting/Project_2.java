package mail_sorting;
import java.util.ArrayList;
import java.util.Scanner;
public class Project_2 {
	

	 

	    public static void main(String[] args) {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("simon.hasler@nmmx.com");
	        emailID.add("leonie.klein@nmx.com");
	        emailID.add("lea.hoch@mnx.com");
	        emailID.add("max.neumann@mnx.com");
	        emailID.add("henrik.fiesler@abcmx.com");
	        emailID.add("laura.kramm@gmx.com");
	        emailID.add("sabine.neuwirth@hmx.com");
	        
	        // new code
	        
	         System.out.println("Enter the email to search");
	         Scanner sc = new Scanner(System.in);
	         String searcElement = sc.nextLine();
	           
	           if (searcElement == null) {
	                System.out.println("You haven't entered an email");
	                return;
	           }
	                 for(int i=0; i<emailID.size(); i++) {
	                    
	                    System.out.println(emailID.get(i));
	                    
	                    if(emailID.contains(searcElement)) {
	                        
	                        System.out.println("\n");
	                        
	                        System.out.println("email ID   " + searcElement + " is found");
	                        System.out.println("the required email is present in the list that has been provided ");
	                       
	                       break;
	                       
	                        
	                        
	                        
	                        
	                        
	                    }
	                }

	    }


}
