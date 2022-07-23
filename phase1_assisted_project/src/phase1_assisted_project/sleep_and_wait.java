package phase1_assisted_project;

public class sleep_and_wait extends Thread {
	public void run() {
		System.out.println("THE DEFAULT VALUE PRODUCED:  * ");
		for(int i=1;i<=2;i++) {
		System.out.println("REPEATED VALUE..");
		try{
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			e.printStackTrace();
			try {
				e.wait(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		}
	}

	public static void main(String[] args) {
		sleep_and_wait prg=new sleep_and_wait();
		prg.start();

	}

}
