
package entidad;
/*Realizar una clase llamada Cuenta (bancaria) que debe tener 
como mínimo los atributos: numeroCuenta (entero), el DNI del 
cliente (entero largo),  el saldo actual. Las operaciones 
asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, 
número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long DNI;
    private long saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNI, long saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public long getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
    
    
}
