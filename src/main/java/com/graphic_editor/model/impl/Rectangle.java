package com.graphic_editor.model.impl;

import com.graphic_editor.model.Shape;
import com.graphic_editor.visitor.ShapeVisitor;

public class Rectangle implements Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
