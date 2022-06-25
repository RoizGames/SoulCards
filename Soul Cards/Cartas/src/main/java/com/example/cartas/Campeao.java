package com.example.cartas;

public class Campeao {
    static double hp = 20;
    static int energia = 20;
    int escudo = 0;
    String classe;

    public void monstro(){
        Cartas c = new Cartas();
        Inimigo enemy = new Inimigo();

        while(c.round < c.round+3){
            enemy.hpInimigo = enemy.hpInimigo - 1;
        }
    }

    public double getHp() {
        return hp;
    }

    public int getEnergia() {
        return energia;
    }
}
