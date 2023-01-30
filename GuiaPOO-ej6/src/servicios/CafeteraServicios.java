package servicios;

import entidad.Cafetera;
import java.util.Scanner;

/**
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la
 * capacidad máxima. • Método servirTaza(int): se pide el tamaño de una taza
 * vacía, el método recibe el tamaño de la taza y simula la acción de servir la
 * taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
 * para llenar la taza, se sirve lo que quede. El método le informará al usuario
 * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. •
 * Método vaciarCafetera(): pone la cantidad de café actual en cero. • Método
 * agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 */
public class CafeteraServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera();

    public void llenarCafetera() {
        double auxCafetera = 0;
        double cafeteraLlena = 0;
        System.out.println("Desea llenar la cafetera?");

        String res = sc.nextLine();

        if ("s".equals(res) || "S".equals(res)) {
            auxCafetera = cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual();
            cafeteraLlena = cafetera.getCapacidadActual() + auxCafetera;

            System.out.println("La cafetera se ha llenado correctamenta"
                    + "contiene " + (cafeteraLlena) + " litros");

        } else {
            System.out.println("Eligio no llenar la cafetera");
        }
    }

    public void llenarTaza() {
        double tamanio = 0;
        System.out.println("Ingrese el tamaño de su taza");
        tamanio = sc.nextDouble();

        if (tamanio < cafetera.getCapacidadActual()) {
            System.out.println("Taza servida correctamente");
            System.out.println("Sobra en la cafetera : " + (cafetera.getCapacidadActual() - tamanio));
        } else {
            double tazaNoLlenada = cafetera.getCapacidadActual() - tamanio;
            System.out.println("Cantidad insuficiente para la taza"
                    + "solo se lleno " + tazaNoLlenada + ""
                    + " de su taza");
        }
    }
    
    public double vaciarCafetera() {
        double vaciar =0;
        System.out.println("Eligio vaciar la cafetera");
        vaciar = cafetera.getCapacidadActual() - cafetera.getCapacidadActual();
        cafetera.setCapacidadActual(vaciar);
        return cafetera.getCapacidadActual();
    }
    
    
    
    public void agregarCafe(Cafetera cafetera){
    double cantCafe =0;
        System.out.println("Ingrese la cantidad de cafe que desee agregar");
        cantCafe = sc.nextDouble();
        cafetera.setCapacidadActual(cafetera.getCapacidadActual() + cantCafe);
        System.out.println("Hay " + cafetera.getCapacidadActual() + "cafe disponible");
    }
}
