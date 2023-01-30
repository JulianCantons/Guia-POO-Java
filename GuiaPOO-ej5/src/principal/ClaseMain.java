package principal;

import entidad.CuentaBancaria;
import java.util.Scanner;
import servicios.CuentaServicio;

public class ClaseMain {

    /**
     * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo
     * los atributos: numeroCuenta (entero), el DNI del cliente (entero largo),
     * el saldo actual. Las operaciones asociadas a dicha clase son: •
     * Constructor por defecto y constructor con DNI, saldo, número de cuenta e
     * interés. • Agregar los métodos getters y setters correspondientes •
     * Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. •
     * Método ingresar(double ingreso): el método recibe una cantidad de dinero
     * a ingresar y se la sumara a saldo actual. • Método retirar(double
     * retiro): el método recibe una cantidad de dinero a retirar y se la
     * restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a
     * retirar, se pondrá el saldo actual en 0. • Método extraccionRapida(): le
     * permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque
     * más del 20%. • Método consultarSaldo(): permitirá consultar el saldo
     * disponible en la cuenta. • Método consultarDatos(): permitirá mostrar
     * todos los datos de la cuenta
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaServicio metodos = new CuentaServicio();
        CuentaBancaria nuevaCuenta = new CuentaBancaria();
        byte op = 0;
       // boolean salida = false;
        
        do {

            System.out.println("Ingrese la opcion que desee"
                    + "\n 1-CREAR NUEVA CUENTA"
                    + "\n 2-DEPOSITAR DINERO"
                    + "\n 3-REALIZAR EXTRACCION"
                    + "\n 4-DATOS DE LA CUENTA"
                    + "\n 5-RETIRO EXPRESS (20%)"
                    + "\n 6-SALDO ACTUAL"
                    + "\n 7-SALIR");
            op = sc.nextByte();

            switch (op) {
                case 1:
                    nuevaCuenta = metodos.crearCuenta();
                    break;
                case 2:
                    metodos.depositar(nuevaCuenta);
                    System.out.println("SU SALDO ACTUALIZADO ES = " + nuevaCuenta.getSaldoActual());
                    break;
                case 3:
                    metodos.retirar(nuevaCuenta);
                    break;
                case 4:
                    System.out.println(nuevaCuenta.toString());
                    break;
                case 5: 
                    metodos.extraccionRapida(nuevaCuenta);
                    System.out.println("Su saldo actual es =" + nuevaCuenta.getSaldoActual());
                    break;
                case 6:
                    System.out.println("SU SALDO ACTUAL ES ="+ nuevaCuenta.getSaldoActual());
                    break;
                case 7:
                    System.out.println("ELIGIO SALIR");
                   // salida = true;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA- INTENTE NUEVAMENTE");

            }
           // System.out.println("Desea realizar otra operacion? S/N");
        } while (op != 7);

        
        System.out.println("----------FIN DEL PROGRAMA----------");
    }

}
