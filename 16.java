import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class circuloArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("el área del círculo es: " + area);

        scanner.close();
    }
}
