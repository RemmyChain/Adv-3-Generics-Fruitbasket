package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
       // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits

        FruitBasket<Fruit> algemeen = new FruitBasket<>();

        algemeen.add(new Apple());
        algemeen.add(new Banana());
        algemeen.add(new Pear());

        System.out.println(algemeen.getContents());

        System.out.println(algemeen.get());

        System.out.println(algemeen.getContents());

        FruitBasket<Apple> appelMand = new FruitBasket<>();

        appelMand.add(new Apple());


    }
}