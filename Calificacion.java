class Calificacion {

    public String obtenerCalificacion(double valor) {
    if(valor >= 0.0 && 5.0 > valor){
        return "Insuficiente";
    }
    else if(valor >= 5.0 && 6.0 > valor) {
        return "Aprobado";
    }
    else if(valor >= 6.0 && 7.0 > valor){
        return "Bien";
    }
    else if(valor >= 7.0 && 9.0 > valor){
        return "Notable";
    }
    else if(valor >= 9.0 && 10.0 >= valor){
        return "Sobresaliente";
    }
        return "Nota inválida";
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        // Pedir nota por pantalla
        double nota = 11.0;
        String calificacion = programa.obtenerCalificacion(nota);
        // Mostrar calificacion
        System.out.println(calificacion);
    }
}