package Calculadora;

import java.util.Scanner;

public class Calculadora {

    private final double numero1;
    private final double numero2;

    public Calculadora (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void sumar (){
        double resultado = (numero1 + numero2 );
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public void restar () {
        double resultado = (numero1 - numero2);
        System.out.println("El resultado de la resta es: " + resultado);
    }
    public void multiplicar () {
        double resultado = (numero1 * numero2);
        System.out.println("El resultado de la multiplicaciòn es: " + resultado);
    }
    public void dividir () {
      if (numero2 == 0){
          System.out.println("Error: no se puede dividir entre 0");
      }else {
          double resultado = (numero1 / numero2);
          System.out.println("El resultado de la divisiòn es: " + resultado);
      }
    }

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: " );
        double num1 = scaner.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        double num2 = scaner.nextDouble();

        Calculadora calculadora = new Calculadora(num1, num2);
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingrese su elección: ");
        int opcion = scaner.nextInt();

        switch (opcion){
            case 1:
                calculadora.sumar();
                break;
            case 2:
                calculadora.restar();
                break;
            case 3:
                calculadora.multiplicar();
                break;
            case 4:
                calculadora.dividir();
                break;
            default:
                System.out.println("Error: opcion no valida");
        }
    }
}
