package com.antbit.slither;

import java.awt.*;

public class Enemy2 extends GameObject {

    private  Handler handler;
    public Enemy2(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
          velX =2;
        velY =9;

    }
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,16,16);
    }
    @Override
    public void tick() {
        float velocityX = velX;
        float velocityY = velY;
        x +=  velocityX;
        y +=    velocityY;
        if (y<=0||y>=Game.HEIGHT-55){velY*= -1;}
        if (x<=0||x>=Game.WIDTH-32){velX*= -1;}
        handler.addObject(new Trail(x,y,ID.Trail,16,16,0.1f,Color.cyan,handler));
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x,(int)y,16,16);

    }


}
