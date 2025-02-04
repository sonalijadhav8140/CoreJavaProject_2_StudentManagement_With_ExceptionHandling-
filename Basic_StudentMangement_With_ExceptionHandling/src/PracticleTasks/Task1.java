package PracticleTasks;


//age validation
public class Task1{
     
	int age;
   public void Voter(int age) throws InvalidageException{
	   if(age<18) {
		 throw new InvalidageException("Invalid Age ");
	   }
   }
}
