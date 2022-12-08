package ru.mirea.Panferov.task2;

public class Program {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory factory = new ChairFactory();
        client.setChair(factory.createVictorianChair(12));
        client.sit();
    }
}
