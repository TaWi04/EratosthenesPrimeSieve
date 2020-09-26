/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tawimmer18
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
    
    private final List<Integer> primes;
    public EratosthenesPrimeSieve(int limit) {
        primes = getPrimeListWithLimit(limit);
    }
 
    @Override
    public boolean isPrime(int p) {
        return primes.contains(p);
    }

    @Override
    public void printPrimes() {
        String s = "";
        for (Integer prime : primes) {
            s += prime+", ";
        }
        System.out.println(s.substring(0, s.length()-2));
    }
    
    private List<Integer> getPrimeListWithLimit(int limit){
        List<Integer> included = new ArrayList();
        List<Integer> notIncluded = new ArrayList();
        
        for (int m = 2; m <= limit; m++) {
            
            if (!notIncluded.contains(m)) {
                
                included.add(m);
                for (int n = (int) Math.pow(m, 2); n <= limit; n += m) {
                    notIncluded.add(n);
                }
                
            }
        }
        
        return included;
    }
}

