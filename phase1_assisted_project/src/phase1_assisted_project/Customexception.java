package phase1_assisted_project;



@SuppressWarnings("serial")
class Notavailable extends Exception{
	
	public Notavailable(String s) {super (s);
}
	
public class Customexception {
	static void validate(int score) throws Notavailable  {
		if(score<180) {
			throw new Notavailable("you have failed the exam");
		}else {System.out.println("you have successfully completed the exam");
	}
     
}

	public static void main(String[] args) {
		try{
			validate(15);
		}
		catch(Notavailable e){
			e.printStackTrace();
		}

	}

}}
