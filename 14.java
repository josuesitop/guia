import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("correo: ");
        String correo = scanner.nextLine();

        System.out.print("número telefonico: ");
        String telefono = scanner.nextLine();
        
        scanner.close();

        System.out.println("Datos ingresados:");
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Teléfono: " + telefono);
    }
}


    
    
    
