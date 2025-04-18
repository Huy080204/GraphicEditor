package com.graphic_editor.model.impl;

import com.graphic_editor.model.Shape;
import com.graphic_editor.visitor.ShapeVisitor;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
    List<Shape> children = new ArrayList<>();

    public void addChild(Shape child) {
        children.add(child);
    }

    public List<Shape> getChildren() {
        return children;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
        for (Shape child : children) {
            child.accept(visitor);
        }
    }
}
