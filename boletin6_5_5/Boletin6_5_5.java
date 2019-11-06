
package boletin6_5_5;

import java.util.Scanner;
public class Boletin6_5_5 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe los tres números:");
        Scanner sc = new Scanner(System.in);
        Numero numeros = new Numero(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        numeros.calcularMaior();
    }
    
}
