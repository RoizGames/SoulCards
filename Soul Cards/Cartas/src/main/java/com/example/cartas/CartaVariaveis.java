package com.example.cartas;

public class CartaVariaveis {
    private double dano;
    private double cura;
    private int custo;


    public CartaVariaveis (double dano, double cura, int custo){
        this.dano = dano;
        this.cura = cura;
        this.custo = custo;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getCura() {
        return cura;
    }

    public void setCura(double cura) {
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
