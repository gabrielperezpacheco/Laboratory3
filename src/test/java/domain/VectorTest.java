package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    public void testVector(){
        Vector vector = new Vector(50);
        vector.sort();
        System.out.println(vector.toString());
        System.out.println("The vector has "+vector.size()+" elements");
        System.out.println(vector.isEmpty()? "Vector is empty":"Vector is not empty");
    }
}