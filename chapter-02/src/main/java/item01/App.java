package item01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author cesardiaz
 */
public class App {

    public static void main(String[] args) {
        Boolean b0 = Boolean.valueOf("0");
        Boolean b1 = Boolean.valueOf("1");
        Boolean b2 = true;
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);

        Random rnd = new Random(123);

        BigInteger bi0 = BigInteger.probablePrime(512, rnd);
        System.out.println(bi0);

        BigInteger bi1 = new BigInteger(512, 1000, rnd);
        System.out.println(bi1);

        Person p1 = new Person("Cesar");
        Person p2 = new Person("Cesar");
        Person p3 = p2;

        if (p1 == p2) {
            System.out.println(String.format("Are equals by p1 == p2 %d - %d",
                    p1.hashCode(), p2.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p1 == p2 %d - %d",
                    p1.hashCode(), p2.hashCode()));
        }

        if (p1.equals(p2)) {
            System.out.println(String.format("Are equals by p1.equals(p2) %d - %d",
                    p1.hashCode(), p2.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p1.equals(p2) %d - %d",
                    p1.hashCode(), p2.hashCode()));
        }

        if (p3 == p1) {
            System.out.println(String.format("Are equals by p3 == p1 %d - %d",
                    p3.hashCode(), p1.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p3 == p1 %d - %d",
                    p3.hashCode(), p1.hashCode()));
        }

        if (p3.equals(p1)) {
            System.out.println(String.format("Are equals by p3.equals(p1) %d - %d",
                    p3.hashCode(), p1.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p3.equals(p1) %d - %d",
                    p3.hashCode(), p1.hashCode()));
        }

        if (p3 == p2) {
            System.out.println(String.format("Are equals by p3 == p2 %d - %d",
                    p3.hashCode(), p2.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p3 == p2 %d - %d",
                    p3.hashCode(), p2.hashCode()));
        }

        if (p3.equals(p2)) {
            System.out.println(String.format("Are equals by p3.equals(p2) %d - %d",
                    p3.hashCode(), p2.hashCode()));
        } else {
            System.out.println(String.format("Are NOT equals by p3.equals(p2) %d - %d",
                    p3.hashCode(), p2.hashCode()));
        }
        
        Map<String, List<String>> m =  App.newInstanceMap();
        System.out.println(m.size());
        
        List<String> l = App.newInstanceList();
        System.out.println(l.size());
    }

    public static <K, V> HashMap<K, V> newInstanceMap() {
        return new HashMap<K, V>();
    }

    public static <M> List<M> newInstanceList() {
        return new ArrayList<M>();
    }
    
}
