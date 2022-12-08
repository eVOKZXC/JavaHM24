package ru.mirea.Panferov.task1;

public class Program {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex(12, -3));
    }
}
