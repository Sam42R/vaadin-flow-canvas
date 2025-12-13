package org.vaadin.pekkam;

import in.virit.color.Color;

import java.awt.geom.Point2D;

public class CanvasRenderingContextWrapper {

    private final CanvasRenderingContext2D context;

    public CanvasRenderingContextWrapper(CanvasRenderingContext2D context) {
        this.context = context;
    }

    public void setFillStyle(Color color) {
        context.setFillStyle(color.toRgbColor().toString());
    }

    public void setStrokeStyle(Color color) {
        context.setStrokeStyle(color.toRgbColor().toString());
    }

    /**
     * @param center
     * @param radius
     * @param startAngle
     * @param endAngle
     * @param clockwise
     */
    public void arc(Point2D.Double center, double radius, int startAngle, int endAngle, boolean clockwise) {
        context.arc(
                center.x,
                center.y,
                radius,
                degreeToRadian(startAngle),
                degreeToRadian(endAngle),
                !clockwise
        );
    }

    private double degreeToRadian(int degree) {
        return degree * Math.PI / 180;
    }
}
