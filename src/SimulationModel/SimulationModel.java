package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;
import gameobjekts.Trie;
import gameobjekts.Lov;
import gameobjekts.Vakstatare;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    int width;
    int height;
    Cell c;
    Cell x;
    Cell ii;
    ArrayList<Trie> tries = new ArrayList<>();
    ArrayList<Lov> Lovs = new ArrayList<>();
    ArrayList<Vakstatare> vakstatares = new ArrayList<>();
    Random rd = new Random();
    public SimulationModel(int width, int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < 5; i++) {
            Trie trie = new Trie(
                    ThreadLocalRandom.current().nextInt(width)
                    ,ThreadLocalRandom.current().nextInt(height)
            );
            tries.add(trie);
        }
        vakstatares.add(new Vakstatare(
                ThreadLocalRandom.current().nextInt(width)
                ,ThreadLocalRandom.current().nextInt(height)
        ));
        vakstatares.add(new Vakstatare(
                ThreadLocalRandom.current().nextInt(width)
                ,ThreadLocalRandom.current().nextInt(height)
        ));
        c = new Cell(2,2);
        x = new Cell(5,5);
        ii = new Cell(8,3);
    }

    public void update() {
        //makeLov();
        c.update();
    }

    private void makeLov() {
        if (rd.nextBoolean()) {
            int max = tries.size();
            int random = ThreadLocalRandom.current().nextInt(max);

        }

    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        //shapes.add(c.getShape());
        //shapes.add(x.getShape());
        //shapes.add(ii.getShape());
        for (Trie t :
                tries) {
            shapes.add(t.getPosison());
        }
        for ( Vakstatare v:
        vakstatares) {
            shapes.add(v.getPosison());
        }
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(c.getSprite());
        return sprites;
    }
}
