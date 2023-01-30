package courseJava;
import java.util.Scanner;
public class Loiane1 {
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    int contador = 0;
    System.out.println("Telefonou para a vítima");
    int resposta = rd.nextInt();
    if(resposta != 1){
        contador+= 1;
    }
        System.out.println("Esteve no local do crime:");
        resposta = rd.nextInt();
        if(resposta != 1){
            contador+= 1;
        }
        System.out.println("Mora perto da vítima");
       resposta = rd.nextInt();
        if(resposta != 1){
            contador+= 1;
        }
        System.out.println("Devia para a vítima");
      resposta = rd.nextInt();
        if(resposta != 1){
            contador+= 1;
        }
        System.out.println("Trabalha com a vítima");
       resposta = rd.nextInt();
        if(resposta != 1){
            contador+= 1;
        }

            switch (contador){
                case 2: System.out.println("Suspeita"); break;
                case 3:
                case 4: System.out.println("Cumplice");break;
                case 5: System.out.println("Culpado");break;
        }
        }
}
