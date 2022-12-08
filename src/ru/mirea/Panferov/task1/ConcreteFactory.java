package ru.mirea.Panferov.task1;

public class ConcreteFactory implements ComplexAbstractFabric{

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
