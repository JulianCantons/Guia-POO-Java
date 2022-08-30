package Entidad;

import java.util.Scanner;

/**
 * La clase incluirá un método para crear el rectángulo con los datos del
 * Rectángulo dados por el usuario. También incluirá un método para calcular la
 * superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo
 * mediante asteriscos usando la base y la altura. Se deberán además definir los
 * métodos getters, setters y constructores correspondientes. Superficie = base
 * * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private double base;
    private double altura;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void datosRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura del rectangulo");
        altura = sc.nextDouble();
    }

    public void calcularSuperficie() {
        double resSuperficie = (base * altura);
        
        System.out.println("La superficie es :" + resSuperficie);
    }

    public void calcularPerimetro() {
        double resPerimetro = ((base + altura) * 2);
        System.out.println("El perimetro es :" + resPerimetro);
    }

    public void dibujarRectangulo() {
        for (int alto = 0; alto < altura; alto++) {
            for (int largo = 0; largo < base; largo++) {
                String aux = "*";
                // Primera y Ultima Linea (Todo con *)
                if (alto == 0 | alto == altura - 1) {
                    aux = "*";
                } else {
                    // Zona media (* o blanco)
                    if (largo == 0 | largo == base - 1) {
                        aux = "*";
                    }
                    if (largo != 0 & largo != base - 1) {
                        aux = " ";
                    }
                }
                // Pintamos caracter que corresponda
                System.out.print(aux);
                // Si es final de linea un salto
                if (largo == base - 1) {
                    System.out.print("\n");
                }
            }
        }

    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", sc=" + sc + '}';
    }
    
    
}
