package loop;

public class LoopExcercise {

	public static void main(String[] args) {
        int n = 10;
        int m = 1;
		
		for (int j=0; j<4; j++) {
	
		for (int i=0; i<4-j; i++) {
			
			System.out.print(n + " ");
			System.out.print("\t");
			n--;
		}
		System.out.println("\n");
		
		}
		
		for (int j=4; j>0; j--) {
			
			for (int i=0; i<=4-j; i++) {
				
				System.out.print(m + " ");
				System.out.print("\t");
				m++;
			}
			System.out.println("\n");
			
			}
		

	}

}
