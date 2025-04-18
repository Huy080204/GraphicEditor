package com.graphic_editor.visitor;

import com.graphic_editor.model.impl.Circle;
import com.graphic_editor.model.impl.Rectangle;
import com.graphic_editor.model.impl.ShapeGroup;
import com.graphic_editor.model.impl.Triangle;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);

    void visit(Triangle triangle);

    void visit(ShapeGroup shapeGroup);
}
