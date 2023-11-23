import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero: ");
        int numero = scanner.nextInt();

         long factorial = calcularFacto(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        scanner.close();
     }      
    }
