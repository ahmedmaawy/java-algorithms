public class Program
{
    public static void step(int n) {
        for(int rows = 1; rows <= n; rows++) {
            for(int cols = 1; cols <=n; cols ++) {
                if(cols <= rows) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
    
	public static void main(String[] args) {
		step(4);
	}
}