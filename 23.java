import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Numnegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("el numero que pusiste es negativo" );
        } else {
            System.out.println("el numero es positivo.");
        }

        
          scanner.close();
    }
}