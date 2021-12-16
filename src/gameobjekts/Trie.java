package gameobjekts;

import Shapes.Point;
import Shapes.Shape;

public class Trie {
    private int x;
    private int y;
    private int color;

    public Trie(int x, int y) {
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

    @Override
    public String toString() {
        return "Trie{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
