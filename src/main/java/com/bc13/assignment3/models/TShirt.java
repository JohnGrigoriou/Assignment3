package com.bc13.assignment3.models;

import com.bc13.assignment3.utils.Utils;

public class TShirt {

    private int id;
    private static int counter = 0;
    private Color Color;
    private Size Size;
    private Fabric Fabric;
    private double price;

    public TShirt() {
    }

    public TShirt(Color Color, Size Size, Fabric Fabric) {
        this.id = ++counter;
        this.Color = Color;
        this.Size = Size;
        this.Fabric = Fabric;
        this.price = Utils.roundTo2DecimalPoints(Color.getColorPrice(Color.ordinal()) + Size.getSizePrice(Size.ordinal()) + Fabric.getFabricPrice(Fabric.ordinal()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public Size getSize() {
        return Size;
    }

    public void setSize(Size Size) {
        this.Size = Size;
    }

    public Fabric getFabric() {
        return Fabric;
    }

    public void setFabric(Fabric Fabric) {
        this.Fabric = Fabric;
    }

    @Override
    public String toString() {
        return String.format("%1$-6s%2$-9s%3$-8s%4$-10s%5$-6s€", id, Color, Size, Fabric, price);
    }
    
    
    
}
