package numberPattern;

public class StarPattern1 {

	public static void main(String args[]) {
		
		int i,j,n =7;
		
		for( i=1; i<=n; i++) {
			for(j=1; j <= i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}