
import java.security.SecureRandom;

public class UniquerRandomNumberDemo {
   static int [] createUniqueRandomNumbers (int from, int to) {


        int n = to - from + 1; // number of integer need to generate
        // create an array to store all numbers in [from, to]
        int a [] = new int[n];
        for (int i = 0; i < n; i ++ ) {
            a [i] = i;
        }
        // an array to store the result 
        int [] result = new int [n];
        int x = n;
        SecureRandom rd =  new SecureRandom();
        for (int i = 0; i < n ; i ++) {
            //k is a random index in [0, x]
            int k = rd.nextInt(x);
            result [i] = a [k];
            // so that we will do not get that value (a[k]) any more
            //we go value from a [k], we re place its value by the value from last index
            a[k] = a [x - 1];
            //Then we decrease x by 1 to get a random index from 0 to x only
            x --;
        }
        return result;
    }
    public static void main (String[] args) {

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        int[] result = createUniqueRandomNumbers(4, 15);

        for (int i = 0; i < result.length; i ++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\n\n--- Estadísticas de rendimiento ---");
        System.out.println("Tiempo en nanosegundos: " + duration + " ns");
        System.out.printf("Tiempo en milisegundos: %.4f ms\n", duration / 1_000_000.0);
    }

}
