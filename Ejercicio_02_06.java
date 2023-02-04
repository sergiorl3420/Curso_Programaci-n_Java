public class Ejercicio_02_06 {
    public static void main (String[] args){
        String nomPadre="Pedro";
        String nomMadre="María Luisa";
        String nomHijo1="María";
        String nomHijo2="Lucas";
        String nomHijo3="Pedro";
        String apellidoUno=" Gómez";
        String apellidoDos=" García";
        String nombreComPadre=pintarPersona(nomPadre,apellidoUno, "");
        String nombreComMadre=pintarPersona(nomMadre, apellidoDos, "");
        String nombreComHijo1=pintarPersona(nomHijo1, apellidoUno, apellidoDos);
        String nombreComHijo2=pintarPersona(nomHijo2, apellidoUno, apellidoDos);
        String nombreComHijo3=pintarPersona(nomHijo3, apellidoUno, apellidoDos);
        System.out.println("Padre: "+nombreComPadre);
        System.out.println("Madre: "+nombreComMadre);
        System.out.println("Hijos: ");
        System.out.println(nombreComHijo1);
        System.out.println(nombreComHijo2);
        System.out.println(nombreComHijo3);
    }
    private static String pintarPersona (String nombre, String apellido1, String apellido2){
        return nombre+apellido1+apellido2;
    }
}
