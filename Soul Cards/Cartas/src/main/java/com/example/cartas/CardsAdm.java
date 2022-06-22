package com.example.cartas;

import java.util.Arrays;
import java.util.List;

public class CardsAdm {
    public void main(String[] args) {
        CardsStatistics CS = new CardsStatistics();

        CS.nat_cobre();

        String Carta1 = "Carta1";
        String Carta2 = "Carta2";
        String Carta3 = "Carta3";
        String Carta4 = "Carta4";
        String Carta5 = "Carta5";
        String Carta6 = "Carta6";
        String Carta7 = "Carta7";
        String Carta8 = "Carta8";

        String ultimaCarta = null;
        String ultimaCartaInimigo = null;

        String[] cartas = {Carta1, CS.nat_cobre(), Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};
        String[] cartasInimigo = {Carta1, Carta2, Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};

        //CARTAS CAMPEAO
        String cartaCampeao1 = "vazio";
        String cartaCampeao2 = "vazio";
        String cartaCampeao3 = "vazio";
        String cartaCampeao4 = "vazio";
        String cartaCampeao5 = "vazio";

        //CARTAS INIMIGO
        String cartaInimigo1 = "vazio";
        String cartaInimigo2 = "vazio";
        String cartaInimigo3 = "vazio";
        String cartaInimigo4 = "vazio";
        String cartaInimigo5 = "vazio";


        if (cartaCampeao1.equals("vazio")) {
            //Sorteio Cartas Campeao
            cartaCampeao1 = cartas[(int) (Math.random() * 8)];
            cartaCampeao2 = cartas[(int) (Math.random() * 8)];
            cartaCampeao3 = cartas[(int) (Math.random() * 8)];
            cartaCampeao4 = cartas[(int) (Math.random() * 8)];
            cartaCampeao5 = cartas[(int) (Math.random() * 8)];
        }

        String[] maoCampeao0 = {cartaCampeao1, cartaCampeao2, cartaCampeao3, cartaCampeao4, cartaCampeao5};

        List<String> maoCampeao = Arrays.asList(maoCampeao0);

        if (cartaInimigo1.equals("vazio")) {

            //Sorteio cartas inimigo
            cartaInimigo1 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo2 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo3 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo4 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo5 = cartasInimigo[(int) (Math.random() * 8)];
        }

        String[] maoInimigo0 = {cartaInimigo1, cartaInimigo2, cartaInimigo3, cartaInimigo4, cartaInimigo5};

        List<String> maoInimigo = Arrays.asList(maoInimigo0);

        if (maoCampeao.contains("Sem carta")) {


            //Repor as cartas
            int reposicao = maoCampeao.indexOf("Sem carta");

            if (reposicao == 0) {
                cartaCampeao1 = cartas[(int) (Math.random() * 8)];
                System.out.println("Você ganhou a carta: " + cartaCampeao1);
            }
            if (reposicao == 1) {
                cartaCampeao2 = cartas[(int) (Math.random() * 8)];
                System.out.println("Você ganhou a carta: " + cartaCampeao2);
            }
            if (reposicao == 2) {
                cartaCampeao3 = cartas[(int) (Math.random() * 8)];
                System.out.println("Você ganhou a carta: " + cartaCampeao3);
            }
            if (reposicao == 3) {
                cartaCampeao4 = cartas[(int) (Math.random() * 8)];
                System.out.println("Você ganhou a carta: " + cartaCampeao4);
            }
            if (reposicao == 4) {
                cartaCampeao5 = cartas[(int) (Math.random() * 8)];
                System.out.println("Você ganhou a carta: " + cartaCampeao5);
            }
            maoCampeao0 = new String[]{cartaCampeao1, cartaCampeao2, cartaCampeao3, cartaCampeao4, cartaCampeao5};
            maoCampeao = Arrays.asList(maoCampeao0);
            System.out.println("-------------------------------------------------------------------------------");
        }
        if (maoInimigo.contains("Sem carta")) {
            //Repor as cartas - INIMIGO
            int reposicaoInimigo = maoInimigo.indexOf("Sem carta");

            if (reposicaoInimigo == 0) {
                cartaInimigo1 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 1) {
                cartaInimigo2 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 2) {
                cartaInimigo3 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 3) {
                cartaInimigo4 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 4) {
                cartaInimigo5 = cartas[(int) (Math.random() * 8)];
            }
            maoInimigo0 = new String[]{cartaInimigo1, cartaInimigo2, cartaInimigo3, cartaInimigo4, cartaInimigo5};
            maoInimigo = Arrays.asList(maoInimigo0);

        }
    }
    }


