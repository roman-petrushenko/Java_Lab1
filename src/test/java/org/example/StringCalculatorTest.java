package org.example;





//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void Test1() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(8, string_calc1.add("4,4"));
    }

    @Test
    void Test2() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(0, string_calc1.add(""));
    }

    @Test
    void Test3() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(-1, string_calc1.add("2,5\\n-100,-2"));
    }

    @Test
    void Test4() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(107, string_calc1.add("2,5\\n0,100"));
    }

    @Test
    void Test5() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(1028, string_calc1.add("//[***][*][**]\\n9**2,1000\\n5*10***2"));
    }

    @Test
    void Test6() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(1029, string_calc1.add("//[***][*][**]\\n9**2,1000\\n5*10***2,1001\\n0,1"));
    }

    @Test
    void Test7() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(1029, string_calc1.add("//[***][*][**]\\n9**2,1000\\n5*10***2,1001\\n0,1"));
    }

    @Test
    void Test8() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(0, string_calc1.add("//[***][*][**]\\n"));
    }
    @Test
    void Test9() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(5, string_calc1.add("5"));
    }
    @Test
    void Test10() {
        StringCalculator string_calc1 = new StringCalculator();
        assertEquals(108, string_calc1.add("//[k]\\n3k100,1010k1\\n4"));
    }
}

