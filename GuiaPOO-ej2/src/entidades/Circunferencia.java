package entidades;

import java.util.Scanner;

/*a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia
(Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro
(Perimetro = 2 ∗ π ∗ radio).

 */

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }    
    
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        radio = sc.nextDouble();
    }
    
    public double Area(){
    double area = 3.14 * radio * radio;
        return area;
    }
    
    public double Perimetro(){
        double perimetro = (2 * 3.14 * radio);
        
        return perimetro;
    }
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
