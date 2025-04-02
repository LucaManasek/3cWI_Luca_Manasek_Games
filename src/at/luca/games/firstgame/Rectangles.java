package at.luca.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private float x;
    private float y;
    private float speed;


    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed = 4.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if (this.x < 600 && this.y < 400){
            this.x += delta / speed;
        }

        if (this.x == 600 && this.y < 400){
            this.y += delta / speed;
        }

        if (this.y == 400) {
            this.x -= delta / speed;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x , this.y, 100, 100);
        graphics.drawString("Hello World", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
