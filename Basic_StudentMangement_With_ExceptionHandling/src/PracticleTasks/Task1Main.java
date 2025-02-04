package PracticleTasks;

public class Task1Main {
     
	public static void main(String[] args){
		Task1 t1=new Task1();
		try {
			t1.Voter(14);
		} catch (InvalidageException e) {
			
			e.printStackTrace();
		}
		
	}
}
