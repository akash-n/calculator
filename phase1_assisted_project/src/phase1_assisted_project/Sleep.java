package phase1_assisted_project;


class MyOwnThread1 extends Thread{
	public void run(){
		
		for(int count=1; count<=3;count++){
			System.out.println("Hello All!!!");
			try {
				Thread.sleep(3000);// sleep is static method 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}

}
