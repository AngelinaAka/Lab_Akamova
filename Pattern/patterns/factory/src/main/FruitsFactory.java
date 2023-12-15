package main;

import java.io.IOException;

abstract class Fruits{}
class Apple extends Fruits{}
class Orange extends Fruits{}
class Kiwi extends Fruits{}
class Avocado extends Fruits{}
class Pineapple extends Fruits{}

public class FruitsFactory {
    public static Fruits createFruits(FruitsType fruitsType) throws IOException {
        switch(fruitsType)
        {
            case Apple:
                return new Apple();
            case Orange:
                return new Orange();
            case Kiwi:
                return new Kiwi();
            case Avocado:
                return new Avocado();
            case Pineapple:
                return new Pineapple();
            default:
                throw new IOException();
        }
    }

    public static void main(String[] args) throws IOException {
        Fruits fruits = FruitsFactory.createFruits(FruitsType.Apple);
    }
}