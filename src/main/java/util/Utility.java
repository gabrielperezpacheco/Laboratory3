package util;

import domain.Vector;
import java.text.DecimalFormat;
import java.util.Random;

public class Utility {
    private static Random random;
    private static long seed; //semilla para el random
    //static initializer
    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }
    public static int random(int bound){
        //return 1+(int)Math.floor(Math.random()*bound);
        return 1+random.nextInt(bound);
    }

    public static String format(double value) {
        return new DecimalFormat("###,###,###.##")
                .format(value);
    }

    public static void fill(Vector vector) {
        int n = vector.getN();
        for (int i = 0; i < n; i++) {
            vector.add( random(99));
        }
    }

    public static int compare(Object a, Object b){

    }
}
