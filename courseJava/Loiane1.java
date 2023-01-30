package courseJava;
import java.util.Scanner;
public class Loiane1 {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    System.out.println("Informe a área que será pintada");
    double areaPintada = rd.nextInt();
    double litro= areaPintada/6.0;
    if(litro<= 3.6){
        System.out.println("Você pode comprar apenas um galão de 3.6l. ");
    } else if (litro<=18.0) {
        System.out.println("Você pode comprar apenas um galão de 18l. ");
    }
    }
}
