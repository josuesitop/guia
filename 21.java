import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class takitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int opcion;
        
            do {
            System.out.println("Menú");
            System.out.println("1. tacos de arrachera");
            System.out.println("2. tacos de pollo");
            System.out.println("3. tacos de suadero");
            System.out.println("4. salir");
            System.out.print("su opción: ");

            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("has pedido tacos de arrachera");
                    break;
                    
                    case 2:
                    System.out.println("has pedido tacos de pollo");
                    break;
                    
                    case 3:
                    System.out.println("has pedido tacos de suadero");
                    break;
                    
                    case 4:
                    System.out.println("saliste del menu");
                    salir = true;
                    break;
                    
                    default;
                    
            }

        } while (salir);

         scanner.close();
    }
}