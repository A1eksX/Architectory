package architectoryHW6.bridge.shapes;

import architectoryHW6.bridge.colors.Color;

public abstract class Shape{
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void shape();
}