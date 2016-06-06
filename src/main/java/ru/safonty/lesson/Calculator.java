package ru.safonty.lesson;

/**
 * Created by V.Safontev on 03.06.2016.
 */
public class Calculator {

    /**
     * Результат вычисления.
     */
    private int result;

    /**
     * Суммируем аргументы.
     *
     * @param params Аргументы суммирования.
     */
    public void add(int... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * Вычитание.
     */
    public void sub(int a, int b) {

        this.result = a - b;

    }

    /**
     * Умножение.
     */
    public void multi(int a, int b) {

        this.result = a * b;

    }

    /**
     * Вычиляем деление.
     */
    public void div(int a, int b) {


        if (b == 0) {
            throw new IllegalArgumentException("You try to div by 0. Please change arg!");
        }
        this.result = a / b;


    }

    /**
     * Получить результат.
     *
     * @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления.
     */
    public void cleanResult() {
        this.result = 0;
    }
}