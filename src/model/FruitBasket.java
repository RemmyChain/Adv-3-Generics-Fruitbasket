package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class FruitBasket<F extends Fruit> {
    private final List<F> contents;

    public FruitBasket(){
        this.contents = new ArrayList<>();
    }

    public void add(F fruit){
        contents.add(fruit);
    }

    public boolean contains(F fruit){
        return contents.contains(fruit);
    }

    public boolean isEmpty(){
        return contents.isEmpty();
    }

    public int size(){
        return contents.size();
    }

    public F get(){
        List<F> tempBin = new ArrayList<>();
        tempBin.add(contents.get(contents.size() - 1));
        contents.remove(contents.size() - 1);
        return tempBin.get(0);
    }

    public List<F> getContents() {
        return contents;
    }
}
