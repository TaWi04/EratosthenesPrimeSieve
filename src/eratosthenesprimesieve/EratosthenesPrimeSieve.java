/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.ArrayList;

/**
 *
 * @author tawimmer18
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
 
    @Override
    public boolean isPrime(int p) {
    return false;//TODO
    }

    @Override
    public void printPrimes() {
        //TODO
    }
    
  
    public int[] getPrimeArrayWithLimit(int limit){
  
        int zahl;
        int zaehler;
        int i = 0;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        ArrayList<Integer> notprime = new ArrayList<Integer>();
        
        for (zahl = 2; zahl <= limit; zahl++) {
           
            for (zaehler = 2; zaehler < Math.sqrt(zahl) + 1; zaehler++) {
                if (!notprime.contains(zahl)) {
                    prime.add(zahl);
                    break;
                }
            }
            /*
            if (primzahl) {
                primzahlArrList[i] = zahl;
                i++;
            }*/
        }
        return prime;
    }
}

