package at.luca.games.firstgame;

import org.newdawn.slick.Graphics;

public class Elipse implements Actor{
    private float speed;
    private float x,y;

    public Elipse(float x, float y) {
        this.x = x;
        this.y = y;
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 18);

    }

    @Override
    public void update(int delta) {
        this.x += (float)delta/this.speed;
        this.y += (float)delta/this.speed;
        if(this.y > 600) {
            this.y = 0;
        }
        if(this.x > 800) {
            this.x = 0;
        }
    }
}
