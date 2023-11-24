import java.util.*;
import java.lang.*;
import java.io.*;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("números primos entre 2 y 500:");

        for (int numero = 2; numero <= 500; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
}
    

 
