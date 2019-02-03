package com.antbit.slither;

import java.awt.*;
import java.util.Random;

public class Boss1 extends GameObject {
    private int timer = 25;
    private int timer2 = 55;
    Random r = new Random();
    private  Handler handler;
    public Boss1(float x, float y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
       velX =5;
        velY =5;

    }
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,96,96);
    }
    @Override
    public void tick() {

        x +=  velX;
        y +=    velY;

        if(timer<=0){
            velY=0;
        }else {
            timer--;
        }

        if(timer<=0) timer--;

        if(timer2<=0){
            if(velX==0)velX=5;
            int spawn = r.nextInt(10);
            if(spawn==0)handler.addObject(new Boss1bullets(x,y,ID.Enemy,handler));
        }
        //if (y<=0||y>=Game.HEIGHT-55){velY*= -1;}
        if (x<=0||x>=Game.WIDTH-32){velX*= -1;}
        //handler.addObject(new Trail((int)x,(int)y,ID.Trail,96,96,0.1f,Color.red,handler));
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x,(int)y,96,96);

    }


}
