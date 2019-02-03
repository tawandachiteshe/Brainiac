package com.antbit.slither;

import java.awt.*;

public class dead  {
    private HUD hud;
    private Handler handler;
    private Game game;
    public void tick(){
        if(hud.HEALTH <=0){
           hud.setScore(1000);
        }
    }

}
