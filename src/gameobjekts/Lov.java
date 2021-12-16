package gameobjekts;

import Shapes.Point;
import Shapes.Shape;

public class Lov {
    private int x;
    private int y;
    private int color;

    public Lov(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape getPosison() {
        return new Point(x,y);
    }
    public int getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
