import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t =0;
       
		int[] A = new int[5];
		for(int i=0; i<A.length; i++) {
	    System.out.println("Digite o valor:");
		 A[i]=scanner.nextInt();
		}
		
		
		
		for (int i=0; i<A.length-1;i++) {
			for (int j=i+1; j< A.length; j++) {
			if(A[i] > A[j]){
				t = A[i];
				A[i]=A[j];
				A[j]=t;
				
		  }
		 }
		}
		
		
			for(int i =0; i<A.length; i++) {
		System.out.println(A[i]);
				}
			}
		
	}

