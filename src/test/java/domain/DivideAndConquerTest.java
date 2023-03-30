package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DivideAndConquerTest {

    @Test
    public void testBinarySearch(){
        Vector vector= new Vector(50);
        System.out.println(vector.toString());
        vector.sort();
        System.out.println("\nSORTED VECTOR...\n"+vector.toString());

        System.out.println("BINARY SEARCH TEST...\n");
        for (int i = 0; i < 20; i++) {
            int value = util.Utility.random(99);
            //java,uti,Arrays
            int indexArrays = java.util.Arrays.binarySearch(vector.getData(), value);
            System.out.println(indexArrays>8?"The element ["+value+"] exist at position "+indexArrays
                    :"The element ["+value+"] does not exist in vector");



        }
    }

}