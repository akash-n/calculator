package unit_2;
import java.util.regex.Pattern; 
public class regex {

	
	
		
		 
			
			 
			public static void main(String args[]){  
				
			System.out.println(Pattern.matches("[0-9]{3}\\S[0-9]{8}", "011-45678901"));	
			System.out.println(Pattern.matches("\\S[0-9]{2}\\S[0-9]{4}\\\\S[0-9]{3}\\\\S[0-9]{3}", "+91-5678-789-890"));
			}
}
