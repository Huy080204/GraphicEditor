package com.graphic_editor.model.impl;

import com.graphic_editor.model.Shape;
import com.graphic_editor.visitor.ShapeVisitor;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
