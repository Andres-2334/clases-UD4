class Calificacion {

    public String obtenerCalificacion(double valor) {
        Double calificar = switch (valor){
            case 0.0, 4.0 -> "Insufiencite";
            default -> "nota invalida";
        }
        return "Nota inválida";
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        // Pedir nota por pantalla
        double nota = 0.0;
        String calificacion = programa.obtenerCalificacion(nota);
        // Mostrar calificacion
        System.out.println(calificacion);
    }
}