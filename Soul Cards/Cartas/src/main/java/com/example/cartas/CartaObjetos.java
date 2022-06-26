package com.example.cartas;

public class CartaObjetos {



    public static void main(String[] args) {
        Campeao campeao = new Campeao();
        Inimigo inimigo = new Inimigo();

        CartaVariaveis NaturezaCobre = new CartaVariaveis(0, 2, 1);
        CartaVariaveis NaturezaAluminio = new CartaVariaveis(0, 3, 2);
        CartaVariaveis NaturezaFerro = new CartaVariaveis(0, 4, 4);
        CartaVariaveis NaturezaOuro = new CartaVariaveis(0, 6, 7);

        CartaVariaveis VazioCobre = new CartaVariaveis(3, 0 , 2);
        CartaVariaveis VazioAluminio = new CartaVariaveis(3, 0, 4);
        CartaVariaveis VazioFerro = new CartaVariaveis(6, 0 , 5);
        CartaVariaveis VazioOuro = new CartaVariaveis(7, 0, 8);

        CartaVariaveis LuzCobre = new CartaVariaveis(2,1,3);
        CartaVariaveis LuzAluminio = new CartaVariaveis(0,0,0); //DAR 25% DO DANO TOMADO
        CartaVariaveis LuzFerro = new CartaVariaveis(0,0,0); //MITIGAR QUALQUER DANO
        CartaVariaveis LuzOuro = new CartaVariaveis(5,5,7);

        CartaVariaveis UniversoCobre = new CartaVariaveis(0,0,0); //escudo que evita 1 de dano por 3 rodadas
        CartaVariaveis UniversoAluminio = new CartaVariaveis(0,0,0); //Monstro que dá 2 de dano no inimigo por 3 rodadas
        CartaVariaveis UniversoFerro = new CartaVariaveis(inimigo.getHpInimigo()*0.20,inimigo.getHpInimigo()*0.20,1);
        CartaVariaveis UniversoOuro = new CartaVariaveis(0,0,0); //Troca de carta com o adversário (Só uma carta, depois reseta as cartas do inimigo)

        //CARTAS MISTAS
        CartaVariaveis VazioLuzCobre = new CartaVariaveis(3,-3,3);
        CartaVariaveis VazioLuzAluminio = new CartaVariaveis(0,0,0); //COPIAR CARTA DO PROPRIO DECK


        //Joga a carta natureza cobre
        VazioLuzCobre.jogaCarta();

        //Status após a jogada
        System.out.println("Vida do campeão: " +campeao.hp);
        System.out.println("Energia do campeão: " +campeao.energia);
        System.out.println("Vida do inimigo: " +inimigo.hpInimigo);
    }
}
