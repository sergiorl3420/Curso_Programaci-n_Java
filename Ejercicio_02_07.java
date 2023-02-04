public class Ejercicio_02_07 {
    public static void main (String[] args){
        String nomPadre="Padre: Pedro";
        String nomMadre="Madre: María Luisa";
        String nomHijo1="María";
        String nomHijo2="Lucas";
        String nomHijo3="Pedro";
        String apellidoUno=" Gómez";
        String apellidoDos=" García";
        pintarNombre(construyeNombre(nomPadre,apellidoUno, ""));
        pintarNombre(construyeNombre(nomMadre, apellidoDos, ""));
        //Seguro que hay una forma más elegante y más correcta de hacerlo, pero para el punto en el que me 
        //encuentro meter aquí lo que me faltaba lo veo super. Cuando tenga experiencia seré capaz de meterlo
        //de manera correcta en el código para no hacer esta guarrada :).
        System.out.println("Hijos:");
        pintarNombre(construyeNombre(nomHijo1, apellidoUno, apellidoDos));
        pintarNombre(construyeNombre(nomHijo2, apellidoUno, apellidoDos));
        pintarNombre(construyeNombre(nomHijo3, apellidoUno, apellidoDos));
    }
    private static String construyeNombre (String nombre, String apellido1, String apellido2){
        return nombre+apellido1+apellido2;
    }
    private static void pintarNombre(String nombreCompleto){
        System.out.println(nombreCompleto);
    }
}