package gameobjekts;

import Shapes.Point;
import Shapes.Shape;

public class Vakstatare {
    private int x;
    private int y;
    private int color;

    public Vakstatare(int x, int y) {
        this.x = x;
        this.y = y;
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