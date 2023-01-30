package entidad;

/**Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). 
Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
 */
public class Cafetera {
    private double capacidadMaxima = 3; //litros
    private double capacidadActual = 0.5;  //litros

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
    
    
    
}
