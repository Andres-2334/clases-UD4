import java.util.Scanner;
public class ParImparMultiplo3 {
public static void Calculadorparimpar(int n){
    double ncomprobar = n;
    
    if(ncomprobar % 2 == 0 && ncomprobar % 3 == 0){
        System.out.println("Es par y multiplo de 3");
    }    
    else if(ncomprobar % 2 == 0){ //los else if son variantes del if principal(el de arriba) que se ejecutan cuando el if de arriba no coincide 
        System.out.println("Es par");
    }
    else if(ncomprobar % 2 != 0 && ncomprobar % 3 == 0){
        System.out.println("Es impar y multiplo de 3");
    }
    else{
        System.out.println("Es impar");
    }
    
    

}
public static void Ejecutar(){
    Scanner sc = new Scanner(System.in);
    while (true){
        System.out.println("Introduce un numero");
        int entrada = sc.nextInt();
        if (entrada == -1){
            System.out.println("cerrado");
        
            break;
        }

       Calculadorparimpar(entrada);
    }
    sc.close();
}

public static void main(String[] args) {
    
    Ejecutar();
}
}

