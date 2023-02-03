import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count =0;
       
		int[] A = new int[5];
		for(int i=0; i<A.length; i++) {
	    System.out.println("Digite o valor"+ ":");
		 A[i]=scanner.nextInt();
		}
		
		int[] B = new int[5];
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]%2 == 0) {
				B[count]=A[i];
				count+=1;
			}
		}
		for(int i = 0; i < A.length; i++) {
			if(A[i]%2 != 0) {
				B[count]=A[i];
				count+=1;
			}
		}
		
			for(int i =0; i<A.length; i++) {
		System.out.println(B[i]);
				}
			}
		
	}

