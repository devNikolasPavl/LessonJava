package ru.javamarathon.day2;

import java.util.Scanner;

/**
 * @author Nikolas Pavlov
 *
 * Есть 2 числа, которые задаются пользователем через консоль (назовем эти 2 числа a и b)
 * Вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
 * Сами числа a и b в диапазоне не уитывать
 */

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++)
        {
            if (i % 5 == 0 && i % 10 != 0)
            {
                System.out.print(i + " ");
            }
        }

    }
}
