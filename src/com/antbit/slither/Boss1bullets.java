package com.antbit.slither;

import java.awt.*;
import java.util.Random;

public class Boss1bullets extends GameObject {

    private  Handler handler;
    private Random r = new Random();
    public Boss1bullets(float x, float y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
          velX = (int)(r.nextInt(5- -5)+-5);
        velY =5;

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
       // if (y<=0||y>=Game.HEIGHT-55){velY*= -1;}
        //if (x<=0||x>=Game.WIDTH-32){velX*= -1;}

        if(y>=Game.HEIGHT)handler.removeObject(this);
        handler.addObject(new Trail((int)x,(int)y,ID.Trail,16,16,0.1f,Color.red,handler));
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x,(int)y,16,16);

    }


}
