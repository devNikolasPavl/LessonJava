package ru.javamarathon.day1;

/**
 * @author Nikolas Pavlov
 *
 * Объявите переменную типа int, имя переменной - age. Присвойте этой переменной свой возраст.
 * Используя цикл while, выведите в столбик строки вида "Мой возраст Х",
 * где Х - это число, которое принимает значение, начиная от вашего текущего возраста до 100 с шагом увеличения равным 5.
 * Строки такого вида выводится до тех пор, пока значения Х не станет больше 100
 */

public class Task4
{
    public static void main(String[] args)
    {
        int age = 42;

        while (age <= 100)
        {
            System.out.println("Мой возраст " + age);
            age += 5;

        }

    }
}
