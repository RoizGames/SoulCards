package com.example.cartas;

public class CartaVariaveis {
    private int dano;
    private int cura;
    private int custo;


    public CartaVariaveis (int dano, int cura, int custo){
        this.dano = dano;
        this.cura = cura;
        this.custo = custo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    public void jogaCarta(){

        Campeao campeao = new Campeao();
        campeao.hp = campeao.hp + cura;
        campeao.energia = campeao.energia - custo;

        Inimigo inimigo = new Inimigo();
        inimigo.hpInimigo = inimigo.hpInimigo - dano;
    }
}
