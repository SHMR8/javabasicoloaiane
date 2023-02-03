import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     
		int[] A = new int[8];
	    int[] B = new int[8];
		for (int i = 0; i< A.length;i++) {
		B[i]=A[i]*2;	
		}
		
        scanner.close();
	}

}