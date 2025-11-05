import java.util.Scanner;
public class LoopMaster {



    public static void contarHastaN(int n){
    
        for (int i = 1; i <= n; i++){
           System.out.println(i);
        }
       
    }
    
    public static void imprimirSumaHastaN(int n){
    int suma = 0;
        for (int i = 1; i <= n; i++){   
            suma += i;
        }
    System.out.println("Suma: " + suma);
    }

    public static void imprimirTablaMultiplicar(int n){
    for (int i = 1; i <= 10; i++){ // las veces que va a repetir la linea de abajo y con todas sus variables posibles empieza desde uno hasta 12 veces en este caso recordatorio mio xd
        System.out.println(n + " x "+i+": "+n*i);
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contarHastaN(sc.nextInt());
        imprimirSumaHastaN(sc.nextInt());
        imprimirTablaMultiplicar(sc.nextInt());
        
    }

}
