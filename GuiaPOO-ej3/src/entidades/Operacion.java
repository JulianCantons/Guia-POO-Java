package entidades;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
    }

    public int Sumar() {
        int suma = num1 + num2;
        return suma;
    }

    public int Restar() {
        int resta = num1 - num2;
        return resta;
    }

    public double Multiplicacion() {
        double multiplicar =0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error- no se puede multiplicar por 0");
            System.out.println(multiplicar =0);
        } else {
            multiplicar = num1 * num2;
        }

        return multiplicar;
    }
    
    public double Dividir (){
    double dividir =0;
        if (num1==0 || num2 ==0) {
            System.out.println("Error- no se puede dividir por 0");
            System.out.println(dividir =0);
        }else {
        dividir = num1/num2;
        }
        return dividir;
    }

    
    
    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
