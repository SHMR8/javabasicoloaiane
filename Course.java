import java.util.Scanner;
public class Course {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     
		System.out.println("Lojas Tabajara");
		double price = 0;
		double sum = 0;
		double cash = 0;
		double troco =0;
		do{
			
			int i =1;
		    System.out.printf("Digite o preço do %d produto: %n",i);
		    price = scanner.nextDouble();
		    sum += price;  
		    i++;
		}while(price !=0);
			
			System.out.println("Dinheiro: ");
			cash = scanner.nextDouble();
			
			troco = cash-sum;
			System.out.println("Troco: "+troco);
		
        scanner.close();
	}

}