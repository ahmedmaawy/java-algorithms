public class Program
{
    public static int totalSteps;
    
    public static void steps(int startStep) {
        if(startStep <= totalSteps) {
            for(int step = 0; step < startStep; step++) {
                System.out.print("#");
            }
            for(int step = startStep; step < totalSteps; step++) {
                System.out.print(" ");
            }
            
            System.out.println("");
            steps(startStep + 1);
        }
    }
    
	public static void main(String[] args) {
	    totalSteps = 4;
		steps(1);
	}
}