public class Ejemplo_02_07 {
    public static void main (String[] args){
    System.out.println ("1)AND: "+(comPri()&&comSeg()));
    System.out.println ("1)OR: "+(comPri()||comSeg()));
    System.out.println ("1)NOT: "+(!comSeg()));
    }
    //Igual que lo que he realizado en el ejercicio anterior, en este caso para poner a prueba los operadores lógicos
    //defino un par de metodos que van a devolver un valor que despues comparare en el método principilar para obtener
    //el boolean del operador lógico según corresponda.

    //IMPORTANTE: en este caso dejo el método vacio para no tener que "pasarle" un valor y de esta manera
    //me devuelva directamente el return que he fijado :).
    private static boolean comPri (){
        return true;
    }
    private static boolean comSeg (){
        return true;
    }
}
