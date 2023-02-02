import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
       System.out.println("Lojas Quase Dois");
       for (int i =1; i<=50; i++) {
    	   double preco = i * 1.99;
    	   System.out.printf("%d - R$ %.2f%n", i,preco);
       }
        
        scanner.close();
	}

}