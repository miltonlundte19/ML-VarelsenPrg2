package SimulationModel;

import Shapes.Point;

public class Trie {
    private int x;
    private int y;
    private int color;

    public Trie(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shapes.Shape getPosison() {
        return new Point(x,y);
    }
    public int getColor() {
        return color;
    }
}
