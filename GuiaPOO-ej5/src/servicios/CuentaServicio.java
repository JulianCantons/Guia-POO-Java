package servicios;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 * Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. • Método
 * ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual. • Método retirar(double retiro): el método
 * recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si
 * la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual
 * en 0. • Método extraccionRapida(): le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. • Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. •
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 */
public class CuentaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de cuenta");
        int varCuenta = sc.nextInt();

        System.out.println("Ingrese su DNI");
        long varDNI = sc.nextLong();

        System.out.println("Ingrese su saldo");
        long varSaldo = sc.nextLong();

        CuentaBancaria nuevaCuenta = new CuentaBancaria(varCuenta, varDNI, varSaldo);

        return nuevaCuenta;
    }

    public void depositar(CuentaBancaria x) {

        System.out.println("Ingrese cantidad de dinero a depositar");
        long aux = sc.nextLong();
        x.setSaldoActual(x.getSaldoActual() + aux);

    }

    public long retirar(CuentaBancaria x) {
        System.out.println("Ingrese monto que desea retirar");
        long retiro = sc.nextLong();

        if (retiro > x.getSaldoActual()) {
            System.out.println("Saldo insuficiente");
        } else {
            x.setSaldoActual(x.getSaldoActual() - retiro);
        }
        return x.getSaldoActual();
    }

    public void extraccionRapida(CuentaBancaria x) {
        System.out.println("Desea realizar extraccion "
                + "rapida? (SOLO 20% DEL SALDO DISPON) s/n");
        String res = sc.next();

        if (res == "s" || res == "S") {

            long calculo = x.getSaldoActual() * 20 / 100;
        }

    }

}
