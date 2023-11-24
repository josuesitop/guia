import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("choose a number from 1 to 7 ");
        int numberDay = scanner.nextInt();

        
        switch (numberDay) {
            case 1:
                System.out.println("Hello im monday");
                break;
            case 2:
                System.out.println("Hi im tuesday");
                break;
            case 3:
                System.out.println("Hi im wednesday");
                break;
            case 4:
                System.out.println("Hi im thursday");
                break;
            case 5:
                System.out.println("Hi im friday");
                break;
            case 6:
                System.out.println("Hi im saturday");
                break;
            case 7:
                System.out.println("Hi im sunday");
                break;
            default:
                
        }

        
        }

        scanner.close();
    }
