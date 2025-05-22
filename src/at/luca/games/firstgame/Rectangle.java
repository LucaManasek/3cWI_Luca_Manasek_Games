package at.luca.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;
    private boolean right = false;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta){
        if (this.right == true) {
            this.x += (float)delta/this.speed;
        }
        else {
            this.x -= (float)delta/this.speed;
        }

        if(this.x > 800) {
            this.x = 0;
        } else if (this.x < 0) {
            this.x = 800;
        }
    }
}