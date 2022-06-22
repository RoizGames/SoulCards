package com.example.cartas;

public class Campeao {
    double hp = 20;
    int energia = 1;
    int escudo = 0;
    String classe;

    public void montro(){
        Cartas c = new Cartas();
        Inimigo enemy = new Inimigo();

        while(c.round < c.round+3){
            enemy.hpEnemy = enemy.hpEnemy - 1;
        }
    }
}
