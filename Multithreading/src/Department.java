
public class Department extends Thread{
	String name;
	Department(String name){
		this.name=name;
		
	}
	public void run() {
		for(int counter=1;counter<=5;counter++) {
			System.out.println("Department-"+name+"task-"+counter);
			try{Thread.sleep(500);
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
