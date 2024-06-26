package test.calculator;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator cal;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Run before each test");
        cal = new Calculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Run after each test");
        cal = null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5.0, cal.add(1.0,4.0),0.00001);
        assertEquals(-1.0, cal.add(1.0,-2.0),0.00001);

    }

    @org.junit.jupiter.api.Test
    void subtract() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void validDivide() {
        assertEquals(1.0, cal.divide(6.0,3.0),0.000001);
    }

    @org.junit.jupiter.api.Test
    void invalidDivide() {
        try {
            cal.divide(3.0,0.0);
            fail();
        } catch (IllegalArgumentException ex) {
            assertTrue(true);
        } catch (Exception ex) {
            fail();
        }

    }
}