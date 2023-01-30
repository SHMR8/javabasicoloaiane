package courseJava;
import java.util.Scanner;
public class Loiane1 {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    System.out.println("Este programa imprimirá a sua média anual");
    int soma = 0;
    int nota;
    for (int i = 1; i <=4; i++){
    System.out.printf("Digite a sua %d nota:",i);
    nota = rd.nextInt();
    soma += nota;
    }
    int media = soma/4;
    System.out.printf("Sua média é %d meu caro",media);
    }
}
