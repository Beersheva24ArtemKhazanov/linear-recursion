package telran.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static telran.util.RecursionMethods.*;

import org.junit.jupiter.api.Test;

public class RecursionMethodsTest {
    @Test
    void ftest() {
        f(400);
    }

    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }

    @Test
    void powTest() {
        assertEquals(64, pow(4, 3));
        assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }

    @Test
    void sumTest() {
        int[] ar = { 1, 2, 3, 4, 5 };
        assertEquals(15, sum(ar));
    }

    @Test
    void squareTest() {
        assertEquals(100, square(10));
        assertEquals(16, square(4));
        assertEquals(25, square(5));
        assertEquals(-64, square(-8));
    }
    @Test
    void isSubStringTest() {
        assertTrue(isSubstring("PeterAlex", "Alex"));
        assertTrue(isSubstring("100gnfk", "100"));
        assertTrue(isSubstring("gfdlgmiddlenovg", "middle"));
        assertTrue(isSubstring("BeGinPeterAlex", "BeGin"));
        assertTrue(isSubstring("BeGinPeterAlex", "G"));
        assertFalse(isSubstring("BeGinPeterAlex", "BeGin100"));
        assertFalse(isSubstring("BeGinPeterAlex", ""));
        assertFalse(isSubstring("BeGinPeterAlex", " "));
        assertFalse(isSubstring("BeGinPeterAlex", "BeGinPeterAlex100"));
    }
}
