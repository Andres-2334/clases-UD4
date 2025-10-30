import java.util.Scanner;

public class Semaforo {

    public String accionSemaforoIf(String color){
        if (color.equalsIgnoreCase("Rojo")){
            return "Detente";
        }
        else if (color.equalsIgnoreCase("Verde")){
            return "Avanza";
        }
        else if (color.equalsIgnoreCase("Amarillo")) {
            return "Preparate";
            
        }
        else{
            return "Invalido";
        }


        
        
    }


    public String accionSemaforoSwitch(String color){
        String Alternativas = switch (color) {
            case "rojo" -> "Detente";
            case "verde" -> "Avanza";
            case "amarillo" -> "Preparate";
            default -> "Invalido";
        };
        
        return Alternativas;
    }

    public static void main(String[] args){
        Semaforo semaforo = new Semaforo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Funcion usando if: ");
        String colorif = sc.nextLine();
        System.out.println(semaforo.accionSemaforoIf(colorif));
        
      
        System.out.println("Funcion usando switch: ");
          String colorswitch = sc.nextLine();
        System.out.println(semaforo.accionSemaforoSwitch(colorswitch));
        sc.close();
        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado

    }
}