package com.graphic_editor;

import com.graphic_editor.model.impl.Circle;
import com.graphic_editor.model.impl.Rectangle;
import com.graphic_editor.model.impl.ShapeGroup;
import com.graphic_editor.model.impl.Triangle;
import com.graphic_editor.visitor.impl.AreaCalculator;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(4, 5);
        Triangle t1 = new Triangle(2, 3);
        Circle c2 = new Circle(2);

        ShapeGroup group1 = new ShapeGroup();
        group1.addChild(c1);
        group1.addChild(r1);

        ShapeGroup group2 = new ShapeGroup();
        group2.addChild(t1);
        group2.addChild(c2);

        ShapeGroup rootGroup = new ShapeGroup();
        rootGroup.addChild(group1);
        rootGroup.addChild(group2);

        AreaCalculator calculator = new AreaCalculator();
        rootGroup.accept(calculator);

        System.out.println("Total area: " + calculator.getTotalArea());
    }
}