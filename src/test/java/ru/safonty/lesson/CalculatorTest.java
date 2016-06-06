package ru.safonty.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by V.Safontev on 04.06.2016.
 */
public class CalculatorTest {


    /**
     * Тест для операции сложения
     *
     * */
    @Test
    public void add() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        assertEquals(2, calc.getResult());
    }

    /**
     * Тест для операции вычитания
     *
     * */
    @Test
    public void sub() throws Exception {
        Calculator calc = new Calculator();
        calc.sub(1, 1);
        assertEquals(0, calc.getResult());
    }

    /**
     * Тест для операции умножения
     *
     * */
    @Test
    public void multi() throws Exception {
        Calculator calc = new Calculator();
        calc.multi(3, 3);
        assertEquals(9, calc.getResult());
    }

    /**
     * Тест для операции деления
     *
     * */
    @Test
    public void div() throws Exception {
        Calculator calc = new Calculator();
        calc.div(9, 3);
        assertEquals(3, calc.getResult());
    }
}