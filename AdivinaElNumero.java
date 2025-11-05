import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void adivinarNumero() {

            Scanner sc = new Scanner(System.in);
            int secreto = 0 + new Random().nextInt(100 - 0 + 1);
            int contador = 0;
            System.out.println("estoy pensando un numero del 0 al 100");
            
            while (true){
            int input = sc.nextInt();

            int contadorInput = contador;


            if (secreto == input){
                contador++;
                System.out.println("Acertaste en " + contadorInput + " Intentos");
                break;

            }
            else if (secreto > input){
                System.out.println("mayor");
                contador++;
            }
            else if (secreto < input){
                System.out.println("menor");
                contador++;
            }
        }
    }





    public static void main(String[] args) {
        adivinarNumero();

    }
}