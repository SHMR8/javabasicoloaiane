import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        double pop1 = 80000;
        double pop2 = 2000000;
        int cont = 0;
        
        while (pop1<=pop2) {
        	pop1 = pop1*0.3;
        	pop2 = pop2*0.15;
        	cont +=1;
        }
     
        System.out.println(cont);
        
        scanner.close();
	}

}