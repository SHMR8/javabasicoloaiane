package courseJava;
import java.util.Scanner;
public class Loiane1 {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);

    System.out.print("Digite um número meu nobre:");
    int numero = rd.nextInt();
    System.out.print("Agora digite outro minha autarquia:");
    int numero1 = rd.nextInt();
    int soma = numero1+numero;
    System.out.printf("A soma dos números digitados foi: %d%n",soma);
    }
}
