package phase1_assisted_project;
public class Runnabledemo implements  Runnable{
	@Override
	public void run() {
		
			System.out.println("thread exexution with exception handling");
		
	}

	public static void main(String[] args) {
		Runnabledemo r=new Runnabledemo ();
	Thread m=new Thread(r);
	for(int i=0;i<10;i++) {
		m.start();
		try {Thread.sleep(1000);}
		catch( Exception e)
		{e.printStackTrace(); }
	}

	
		

	}
}
