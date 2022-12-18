package ru.video01.dmitria.project01.chp04.lesson_03;

public class Var
{
    public static void main(String[] args)
    {
        var text = "Hello";
        System.out.println(text);

        text = "Java";
        System.out.println(text);

        text = "Hello " + System.getProperty("user.name");
        System.out.println(text);

    }
}
