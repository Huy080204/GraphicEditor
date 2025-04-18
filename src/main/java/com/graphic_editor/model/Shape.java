package com.graphic_editor.model;

import com.graphic_editor.visitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
