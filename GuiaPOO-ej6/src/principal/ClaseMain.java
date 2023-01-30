package principal;

import entidad.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicios;

public class ClaseMain {

    /**
     * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
     * capacidadMaxima (la cantidad máxima de café que puede contener la
     * cafetera) y cantidadActual (la cantidad actual de café que hay en la
     * cafetera). Implemente, al menos, los siguientes métodos: • Constructor
     * predeterminado o vacío • Constructor con la capacidad máxima y la
     * cantidad actual • Métodos getters y setters. • Método llenarCafetera():
     * hace que la cantidad actual sea igual a la capacidad máxima. • Método
     * servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
     * tamaño de la taza y simula la acción de servir la taza con la capacidad
     * indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
     * se sirve lo que quede. El método le informará al usuario si se llenó o no
     * la taza, y de no haberse llenado en cuanto quedó la taza. • Método
     * vaciarCafetera(): pone la cantidad de café actual en cero. • Método
     * agregarCafe(int): se le pide al usuario una cantidad de café, el método
     * lo recibe y se añade a la cafetera la cantidad de café indicada.
     *
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int res = 0;
        Cafetera cafetera = new Cafetera();
        CafeteraServicios nuevoServicio = new CafeteraServicios();

       // nuevoServicio.llenarCafetera();

        do {

            System.out.println("Ingrese la opcion que desee:"
                    + "\n 1-LLENAR LA CAFETERA"
                    + "\n 2-LLENAR SU TAZA"
                    + "\n 3-VACIAR CAFETERA"
                    + "\n 4-AGREGAR CAFE"
                    + "\n 5-SALIR");
            res = sc.nextInt();

            switch (res) {
                case 1:
                    nuevoServicio.llenarCafetera();
                    break;
                case 2:
                    nuevoServicio.llenarTaza(); 
                    break;
                case 3:
                    nuevoServicio.vaciarCafetera();
                    break;
                case 4:
                    nuevoServicio.agregarCafe(cafetera);
                    break;
                case 5:
                        System.out.println("ELIGIO SALIR");
                        break;
                        default:
                            System.out.println("OPCION INCORRECTA");

            }
        } while (res != 5);

        System.out.println("-----FIN DEL PROGRAMA-----");

    }

}
