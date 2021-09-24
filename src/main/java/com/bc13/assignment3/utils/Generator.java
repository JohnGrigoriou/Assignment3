package com.bc13.assignment3.utils;

import com.bc13.assignment3.models.Color;
import com.bc13.assignment3.models.Fabric;
import com.bc13.assignment3.models.Size;
import com.bc13.assignment3.models.TShirt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    
    private Random random = new Random();
    
    public Generator() {
    }

    public Color randomColor() {
        Color randomColor;
        randomColor = Color.values()[random.nextInt(Color.values().length)];
        return randomColor;
    }
    public Size randomSize() {
        Size randomSize;
        randomSize = Size.values()[random.nextInt(Size.values().length)];
        return randomSize;
    }
    public Fabric randomFabric() {
        Fabric randomFabric;
        randomFabric = Fabric.values()[random.nextInt(Fabric.values().length)];
        return randomFabric;
    }
    
    public TShirt randomTShirt() {
        return new TShirt(randomColor(), randomSize(), randomFabric());
    }
    
    public List<TShirt> generateTShirts() {
        List<TShirt> listOfTShirts = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            listOfTShirts.add(randomTShirt());
        }
        return listOfTShirts;
    }
    
}
