package com.example.platformgame.player;

public class Player {
    private int x, y, velocity, jumpVal;
    private static int JUMP_VALOR = 2;
    private static int VELOCITY_VALOR = 2;


    public Player(int x, int y, int velocity, int jumpVal) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.jumpVal = jumpVal;

    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.velocity = VELOCITY_VALOR;
        this.jumpVal = JUMP_VALOR;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void moveForward(){
        x += velocity;

    }

    public void moveBackward(){
        x -= velocity;
    }

    public void jump(){
        y += jumpVal;
    }
}
