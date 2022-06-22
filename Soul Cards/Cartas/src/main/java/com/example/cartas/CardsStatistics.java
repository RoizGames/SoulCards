package com.example.cartas;

public class CardsStatistics {
    int dano;
    int cura;
    int custo;
    String joia;
    String metal;


    Campeao champ = new Campeao();
    Inimigo enemy = new Inimigo();

    //AÇÕES

    //CARTAS NATUREZA
    public void nat_cobre(){
        champ.hp = champ.hp + 2;
        custo = 1;
    }

    public void nat_alum(){
        champ.hp = champ.hp + 3;
        custo = 2;
    }

    public void nat_ferro(){
        champ.hp = champ.hp + 4;
        custo = 4;
    }

    public void nat_ouro(){
        champ.hp = champ.hp + 6;
        custo = 7;
    }
//--------------------------------------------------------------------------------------//

    //CARTAS VAZIO
    public void vazio_cobre(){
        enemy.hpEnemy = enemy.hpEnemy - 3;
        custo = 2;
    }

    public void vazio_alum(){
        enemy.hpEnemy = enemy.hpEnemy - 3;
        custo = 4;
    }

    public void vazio_ferro(){
        enemy.hpEnemy = enemy.hpEnemy - 6;
        custo = 5;
    }

    public void vazio_ouro(){
        enemy.hpEnemy = enemy.hpEnemy - 7;
        custo = 8;
    }

//-----------------------------------------------------------------------------------//

    //CARTAS LUZ
    public void luz_cobre(){
        enemy.hpEnemy = enemy.hpEnemy - 2;
        champ.hp = champ.hp + 1;
        custo = 3;
    }

    public void luz_alum(){
        enemy.hpEnemy = enemy.hpEnemy - 2;  //FAZER DEVOLVER 25% DO DANO TOMADO
        champ.hp = champ.hp + 1;
        custo = 1;
    }

    public void luz_ferro(){
        enemy.hpEnemy = enemy.hpEnemy - 2; //FAZER MITIGAR O DANO SOFRIDO
        champ.hp = champ.hp + 1;
        custo = 3;
    }

    public void luz_ouro(){
        enemy.hpEnemy = enemy.hpEnemy - 5;
        champ.hp = champ.hp + 5;
        custo = 7;
    }

//------------------------------------------------------------------------------------//

    //CARTAS UNIVERSO
    public void universo_cobre(){
        champ.escudo = champ.escudo + 3;
        custo = 2;
    }

    public void universo_alum(){
        enemy.hpEnemy = enemy.hpEnemy + 3;
        custo = 2;
    }
}
