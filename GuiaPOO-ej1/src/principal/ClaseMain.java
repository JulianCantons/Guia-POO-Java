package principal;

import entidades.Libro;
import java.util.Scanner;

public class ClaseMain {

    /**
     * 1. Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío. Crear un método
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro y
     * el numero de páginas
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Libro nuevoLibro = new Libro();
        
        System.out.println("Ingrese el ISBN del libro");
        int auxISBN = sc.nextInt();
        nuevoLibro.setISBN(auxISBN);
        
        System.out.println("Ingrese el titulo");
       
        nuevoLibro.setTitulo(sc.next());
        
        System.out.println("Ingrese el autor");
        nuevoLibro.setAutor(sc.next());
        
        System.out.println("Ingrese el numero de paginas");
        nuevoLibro.setNumPags(sc.nextInt());
        
        
        System.out.println(nuevoLibro.toString());
        

    }
    

}
