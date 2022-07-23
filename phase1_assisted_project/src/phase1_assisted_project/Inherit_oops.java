package phase1_assisted_project;

class  Inherit_oops {
	public int concepts;
	public int divisions;
	public Inherit_oops(int concepts,int divisions) {
this.concepts=concepts;
this.divisions=divisions;
}
	
public String toString()  
{ 
    return("No of concepts are " + concepts + "\n" + "covered is " + divisions); 
}  
class Study extends Inherit_oops{
	public int topics;
	public Study(int concepts,int divisions,int topics) {
		super(concepts,divisions);
		
	}
	}
public class portion{

	public static void main(String[] args) {
		Study mb = new Study(3, 100, 45 ); 
		System.out.println(mb.toString());

	}
}
}
