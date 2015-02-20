/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item01;

import java.math.BigInteger;
import java.util.EnumSet;
import java.util.Random;

/**
 *
 * @author cesardiaz
 */
public class App {

	enum State {
		
	}
	
    public static void main(String[] args) {
        Boolean b0 = Boolean.valueOf("0");
        Boolean b1 = Boolean.valueOf("1");
        Boolean b2 = Boolean.valueOf(true);
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);
        
        Random rnd = new Random(123);

        BigInteger bi0 = BigInteger.probablePrime(512, rnd);
        System.out.println(bi0);
        
        BigInteger bi1 = new BigInteger(512, 1000, rnd);
        System.out.println(bi1);
        
        EnumSet<State> s;
    }

}
