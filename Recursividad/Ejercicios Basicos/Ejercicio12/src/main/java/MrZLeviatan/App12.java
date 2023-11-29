package MrZLeviatan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App12 {

    public static void main(String[] args) {


        System.out.println(" --EJERCICIO 12-- ");

        int base = obtenerBase();
        int potencia = obtenerPotencia();

        System.out.printf(" El numero %d potenciado en %d es: "
                + calcular(base,potencia),base,potencia);

        }

    public static int calcular (int base, int potencia){
        int total;
        if (base == 0){
            if (potencia ==0) {
                total = 1;
            }else {
                total = 0;
            }
        }else{

            if (potencia == 0){
                total= 1;
            }else{

                if( potencia != 1){
                    total= base* calcular(base,potencia-1);
                }else{
                    total =base;
                }
            }
        }
        return total;
    }

    public static int obtenerBase () {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println(" Digite un numero Por favor: ");

        try {
            numero = sc.nextInt();
            return numero;

        } catch (InputMismatchException e) {
            System.out.println("Error: " + "El valor tecleado debe ser un entero");
            return obtenerBase();
        }
    }

    public static int obtenerPotencia () {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println(" Digite la potencia: ");

        try {
            numero = sc.nextInt();
            return numero;

        } catch (InputMismatchException e) {
            System.out.println("Error: " + "El valor tecleado debe ser un entero");
            return obtenerPotencia();
        }
    }
}