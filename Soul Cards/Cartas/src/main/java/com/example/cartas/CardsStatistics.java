package com.example.cartas;

public class CardsStatistics {
    int dano;
    int cura;
    int custo;
    String joia;
    String metal;

    //CARTAS
    String carta1;


    Campeao champ = new Campeao();
    Inimigo enemy = new Inimigo();

    //AÇÕES

    //CARTAS NATUREZA
    public String nat_cobre() {
        champ.hp = champ.hp + 2;
        custo = 1;
        return carta1;
    }

    public void nat_alum() {
        champ.hp = champ.hp + 3;
        custo = 2;
    }

    public void nat_ferro() {
        champ.hp = champ.hp + 4;
        custo = 4;
    }

    public void nat_ouro() {
        champ.hp = champ.hp + 6;
        custo = 7;
    }
//--------------------------------------------------------------------------------------//

    //CARTAS VAZIO
    public void vazio_cobre() {
        enemy.hpInimigo = enemy.hpInimigo - 3;
        custo = 2;
    }

    public void vazio_alum() {
        enemy.hpInimigo = enemy.hpInimigo - 3;
        custo = 4;
    }

    public void vazio_ferro() {
        enemy.hpInimigo = enemy.hpInimigo - 6;
        custo = 5;
    }

    public void vazio_ouro() {
        enemy.hpInimigo = enemy.hpInimigo - 7;
        custo = 8;
    }

//-----------------------------------------------------------------------------------//

    //CARTAS LUZ
    public void luz_cobre() {
        enemy.hpInimigo = enemy.hpInimigo - 2;
        champ.hp = champ.hp + 1;
        custo = 3;
    }

    public void luz_alum() {
        enemy.hpInimigo = enemy.hpInimigo - 2;  //FAZER DEVOLVER 25% DO DANO TOMADO
        champ.hp = champ.hp + 1;
        custo = 1;
    }

    public void luz_ferro() {
        enemy.hpInimigo = enemy.hpInimigo - 2; //FAZER MITIGAR O DANO SOFRIDO
        champ.hp = champ.hp + 1;
        custo = 3;
    }

    public void luz_ouro() {
        enemy.hpInimigo = enemy.hpInimigo - 5;
        champ.hp = champ.hp + 5;
        custo = 7;
    }

//------------------------------------------------------------------------------------//

    //CARTAS UNIVERSO
    public void universo_cobre() {
        champ.escudo = champ.escudo + 3;
        custo = 2;
    }

    public void universo_alum() {
        enemy.hpInimigo = enemy.hpInimigo + 3;
        custo = 2;
    }

    public void universo_ferro() {
        champ.hp = champ.hp + (enemy.hpInimigo / 0.2);
        enemy.hpInimigo = enemy.hpInimigo - (enemy.hpInimigo / 0.2);
        custo = 1;
    }

    public void universo_ouro() {
        champ.hp = champ.hp - (enemy.hpInimigo / 0.2); //FAZER TROCAR DE CARTA COM O CAMPEÃO E RESETAR A MÃO DO MESMO: APENAS UMA
        enemy.hpInimigo = enemy.hpInimigo - (enemy.hpInimigo / 0.2);
        custo = 1;
    }

    //------------------------------------------------------------------------------------//
    //MISTURAS
    public void vazio_luz_cobre() {
        champ.hp = champ.hp - 3;
        enemy.hpInimigo = enemy.hpInimigo - 3;
        custo = 3;
    }

    public void vazio_luz_alum() {
        champ.hp = champ.hp - 3; //FAZER COPIAR UMA CARTA DO SEU PROPRIO DECK
        enemy.hpInimigo = enemy.hpInimigo - 3;
        custo = 3;
    }
}
