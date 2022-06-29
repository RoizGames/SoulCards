package com.example.cartas;

import static com.example.cartas.CardsAdmMelhorado.*;

public class ConjuntoMaos {
    private int turno;

    boolean humorRaiva;
    boolean humorNormal;
    boolean estrategiaInicial = turno<10;
    boolean estrategiaSecundaria = turno>=10;

    boolean hpCampeaoBaixo = campeao.hp <= 10;
    boolean hpCampeaoMedio = campeao.hp >= 11 && campeao.hp <= 19;
    boolean hpCampeaoAlto = campeao.hp >= 20;

    boolean hpInimigoBaixo = Inimigo.hpInimigo <= 10;
    boolean hpInimigoMedio = Inimigo.hpInimigo >= 11 && Inimigo.hpInimigo <= 19;
    boolean hpInimigoAlto = Inimigo.hpInimigo >= 20;

    private int cartaPosse1;
    private int cartaPosse2;
    private int cartaPosse3;
    private int cartaPosse4;

    public ConjuntoMaos(int cartaPosse1, int cartaPosse2, int cartaPosse3, int cartaPosse4) {
        this.cartaPosse1 = cartaPosse1;
        this.cartaPosse2 = cartaPosse2;
        this.cartaPosse3 = cartaPosse3;
        this.cartaPosse4 = cartaPosse4;
    }

    public int getCartaPosse1() {
        return cartaPosse1;
    }

    public void setCartaPosse1(int cartaPosse1) {
        this.cartaPosse1 = cartaPosse1;
    }

    public int getCartaPosse2() {
        return cartaPosse2;
    }

    public void setCartaPosse2(int cartaPosse2) {
        this.cartaPosse2 = cartaPosse2;
    }

    public int getCartaPosse3() {
        return cartaPosse3;
    }

    public void setCartaPosse3(int cartaPosse3) {
        this.cartaPosse3 = cartaPosse3;
    }

    public int getCartaPosse4() {
        return cartaPosse4;
    }

    public void setCartaPosse4(int cartaPosse4) {
        this.cartaPosse4 = cartaPosse4;
    }
    public void jogaCartaInimigo(){
        if(maoInimigo.contains(cartaPosse1)||maoInimigo.contains(cartaPosse2)
        ||maoInimigo.contains(cartaPosse3)||maoInimigo.contains(cartaPosse4)){

        }
    }


    public void filtraCarta() {
        if(estrategiaInicial) {
            if (hpInimigoBaixo) { //HP DO INIMIGO BAIXO
                if (hpCampeaoBaixo) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoMedio) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoAlto) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
            }
            if (hpInimigoMedio) { //HP DO INIMIGO MEDIO
                if (hpCampeaoBaixo) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoMedio) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoAlto) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
            }
            if (hpInimigoAlto) { //HP DO INIMIGO ALTO
                if (hpCampeaoBaixo) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoMedio) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
                if (hpCampeaoAlto) {
                    if (humorNormal) {

                    }
                    if (humorRaiva) {

                    }
                }
            }
        }
        if(estrategiaSecundaria){

        }
        }
    }

