package ru.skillfax.project_02.lesson_03;

public class Main
{
    // метод, который стартует вашу программу, то есть это своего рода начальная точка,
    // с этого метода начинается выполнение кода
    public static void main(String[] args)
    {
        // создаем объект на основании класса
        Cookie cookie = new Cookie();
        // вызываем метод нашего класса, чтобы испекь печеньки
        cookie.bake();

    }

}
