package com.graphic_editor.visitor.impl;

import com.graphic_editor.model.impl.Circle;
import com.graphic_editor.model.impl.Rectangle;
import com.graphic_editor.model.impl.ShapeGroup;
import com.graphic_editor.model.impl.Triangle;
import com.graphic_editor.visitor.ShapeVisitor;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Triangle triangle) {
        totalArea += (triangle.getBase() * triangle.getHeight()) / 2;
    }

    @Override
    public void visit(ShapeGroup shapeGroup) {

    }

    public double getTotalArea() {
        return new BigDecimal(totalArea)
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
