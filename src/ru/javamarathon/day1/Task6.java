package ru.javamarathon.day1;

/**
 * @author Nikolas Pavlov
 *
 * Объявите переменную типа int, имя переменной - k.
 * Присвойте этой переменной какую-нибудь цифру от 1 до 9.
 */

public class Task6
{
    public static void main(String[] args)
    {
        int k = 5;

        for (int i = 1; i < 10; i++)
        {
            System.out.println(i + " x " + k + " = " + i * k);

        }

    }
}
