/**
 * @author Nikolas Pavlov
 *
 * вычислить расстояние, проходимое светом, используя переменные типа Long
 */

package ru.book01.shildt.chapter3.lesson_01;

public class Light
{
    public static void main(String[] args)
    {
        int lightspeed;
        long days;
        long second;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        // указать количество дней
        days = 1000;

        // преобразовать в секунды
        second = days * 24 * 60 * 60;

        // вычислить расстояние
        distance = lightspeed * second;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
