//En este ejemplo voy a poner en práctica la estructura condicional switch para determinar controlar el aforo
//de una sala y suponiendo que se muestra el mensaje en una pantalla o en un dispositivo móvil ubicado cerca de 
//la entrada de la misma.
public class Ejemplo_03_04 {
    private static final int NUM_PERSONAS=100;
    //Para continuar con lo que propone el libro voy a usar una constante fija para todo el código que usare
    //en la estructura condicional, en este caso switch con la cual me evito unos cuantos if/else/else if :).
    public static void main (String[] args){
        switch (NUM_PERSONAS) {
            case 0:
                System.out.println("La sala se encuentra vacia.");
                break;
            case 25:
                System.out.println("La sala se encuentra al 25% del aforo.");
                break;    
            case 50:
                System.out.println("La sala se encuentra al 50% del aforo.");
                break;
            case 75:
                System.out.println("La sala se encuentra al 75% del aforo.");
                break;
            case 100:
                System.out.println("La sala se encuentra al 100% del aforo. ¡NO ENTRAR!");
                break;       
            default:
                System.out.println("El servicio no se encuentra disponible, disculpen las molestias.");
                break;
        }
    }
}