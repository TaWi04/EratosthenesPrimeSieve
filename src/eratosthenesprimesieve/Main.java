/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.Scanner;

/**
 *
 * @author tawimmer18
 */
public class Main {
    private static final String menu ="1 .. Alle Primzahlen bis zu einem Limit ausgeben\n"
            + "2 .. Primzahlenadditionen für gerade Zahl ausgeben\n"
            + "9 .. Beenden";
    
    public static void main(String[] args) {
       EratosthenesPrimeSieve eps;
        int auswahl;
        do {
            
            System.out.println(menu);
            auswahl = intInput();
            switch(auswahl){
                case 1:
                    System.out.println("Bitte geben Sie ein Limit ein!");
                    int limit = intInput();
                    if(limit == -1){
                        System.out.println("Es wurde keine Zahl eingegeben!");
                        break;
                    }
                    eps = new EratosthenesPrimeSieve(limit);
                    eps.printPrimes();
                    break;
                    
                case 2:
                    System.out.println("Bitte geben Sie eine gerade Zahl ein!");
                    int zahl = intInput();
                    if(zahl == -1){
                        System.out.println("Es wurde keine Zahl eingegeben!");
                        break;
                    }
                    else if(zahl % 2 != 0) {
                        System.out.println("Die eingegebene Zahl ist nicht gerade!");
                        break;
                    }
                    eps = new EratosthenesPrimeSieve(zahl);
                    eps.printPrimesAdditions();
                    break;
                    
                default:
                    break;
            }
            
        } while (auswahl != 9);
        
    }
    
    private static int intInput(){
        
        Scanner scanner = new Scanner(System.in,"Windows-1252");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
