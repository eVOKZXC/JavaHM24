package ru.mirea.Panferov.task1;

public class Complex {
    int real, image;

    public Complex(){
        real = 0;
        image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        if (image == 0) return Integer.toString(real);
        if (real == 0) return image + "i";
        return image >= 0 ? real + "+" + image + "i" : real + "-" + -1*(image) + "i";
    }
}
