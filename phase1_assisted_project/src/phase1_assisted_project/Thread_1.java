package phase1_assisted_project;

public class Thread_1 implements Runnable{

	public static void main(String[] args) {
		Thread t=new Thread(new Thread_1());
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The thread begins:  ");
	}

}
