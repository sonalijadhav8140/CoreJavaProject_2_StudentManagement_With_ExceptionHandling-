package task2;

public class task {
   
	float div;
	public void division(float num) throws DivisionByZeroException {
		if(num<=0) {
			 throw new DivisionByZeroException("Division By ZERo");
		}
		else
			 System.out.println( div = 10/num);;
	}
	
}
