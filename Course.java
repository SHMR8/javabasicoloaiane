import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da sua nota: ");
        int nota = scanner.nextInt();
        
        while(nota<0 || nota>10) {
        	
        	System.out.println("Digite uma nota válida:");
        	nota = scanner.nextInt();
        }
        
     System.out.println("Agora sim, uma nota válida, obrigado!");
     
        scanner.close();
	}

}