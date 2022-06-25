package com.example.cartas;

public class CartaObjetos {

    public static void main(String[] args) {

        CartaVariaveis NaturezaCobre = new CartaVariaveis(0, 2, 1);
        CartaVariaveis NaturezaAluminio = new CartaVariaveis(0, 3, 2);
        CartaVariaveis NaturezaFerro = new CartaVariaveis(0, 4, 4);
        CartaVariaveis NaturezaOuro = new CartaVariaveis(0, 6, 7);

        CartaVariaveis VazioCobre = new CartaVariaveis(3, 0 , 2);
        CartaVariaveis VazioAluminio = new CartaVariaveis(3, 0, 4);
        CartaVariaveis VazioFerro = new CartaVariaveis(6, 0 , 5);
        CartaVariaveis VazioOuro = new CartaVariaveis(7, 0, 8);


        Campeao campeao = new Campeao();
        Inimigo inimigo = new Inimigo();

        //Joga a carta natureza cobre
        VazioFerro.jogaCarta();

        //Status após a jogada
        System.out.println("Vida do campeão: " +campeao.hp);
        System.out.println("Energia do campeão: " +campeao.energia);
        System.out.println("Vida do inimigo: " +inimigo.hpInimigo);
    }
}
