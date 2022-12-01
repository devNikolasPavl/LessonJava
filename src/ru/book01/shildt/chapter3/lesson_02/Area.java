package ru.book01.shildt.chapter3.lesson_02;

/**
 * @author Nikolas Pavlov
 * вычислить площадь круга
 */

public class Area
{
    public static void main(String[] args)
    {
        double pi, r, a;

        // радиус окружности
        r = 10.8;
        // число пи
        pi = 3.1416;
        // вычислить площадь круга
        a = pi * r * r;

        System.out.println("Площадь круга равна " + a);
    }
}
