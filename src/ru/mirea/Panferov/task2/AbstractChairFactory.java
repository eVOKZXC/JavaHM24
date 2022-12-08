package ru.mirea.Panferov.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicanChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
