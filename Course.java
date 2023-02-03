import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     
		int[] A = new int[10];
		int cont = 0;
		for (int i =0; i<A.length;i++) {
			System.out.println("Digite o "+(i+1)+"º valor: ");
			A[i]=scanner.nextInt();
		}
		for(int i =0; i<A.length;i++) {
			if(A[i]%2 != 0) {
			cont +=1;}
		}
		System.out.println("Esta é a quantidade de números pares: "+ cont);
        scanner.close();
	}

}