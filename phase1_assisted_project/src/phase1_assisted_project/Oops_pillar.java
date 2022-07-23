package phase1_assisted_project;

 class Oops_pillar{
	String name;
	String subject;
	int hours;
	int working_date;

public Oops_pillar(String name,String subject,int hours,int working_date) {
	this.name=name;
	this.subject=subject;
	this.hours=hours;
	this.working_date=working_date;
}
	public String getname(){return name;}
	public String getsubject(){return subject;}
	public int gethours(){return hours;}
	public int getworking_date(){return working_date;}
    @Override
 public String toString() 
 { 
     return("Hi my name is "+ this.getname()+ ".\nMy study subject are " + this.getsubject()+".\ni have allocated " + this.gethours()+ " hours, on"+ this.getworking_date() + "to complete my work"); 
 } 
public static void main(String[] args) 
{ Oops_pillar max=new Oops_pillar("maxzander","aeronautics",5,17_6_2022);
Oops_pillar vasathi=new Oops_pillar("vasanthi","BIOmedics",5,17_6_2022);
System.out.println(max.toString());
System.out.println(vasathi.toString());
}}


