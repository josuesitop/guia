import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class tablaaaa {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("de que numero deseas ver la tabla ?: ");
    int numero = scanner.nextInt();

    System.out.println("tabla de multiplicar del " + numero);

    for (int i = 1; i <= 10; i++) {
    int resultado = numero * i;
    System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
