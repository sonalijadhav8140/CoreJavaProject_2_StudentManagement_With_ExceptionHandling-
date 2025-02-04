package task2;

public class Taskmain {

	
	public static void main(String[] args) {
		task t=new task();
		
		try {
		t.division(5);
		}
		catch(DivisionByZeroException e) {
			e.printStackTrace(); ;
		}
	}
	
}
